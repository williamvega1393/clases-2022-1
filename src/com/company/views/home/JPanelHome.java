package com.company.views.home;

import org.apache.poi.hssf.usermodel.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.io.FileOutputStream;
import java.util.Properties;

public class JPanelHome extends JPanel {

    private JLabel jLabelTitle;

    private JCheckBox checkBoxAcceptTerm;
    private JCheckBox checkBoxAcceptTerm1;
    private JCheckBox checkBoxAcceptTerm2;

    private ButtonGroup buttonGroup;
    private JRadioButton jRadioButtonOption1;
    private JRadioButton jRadioButtonOption2;
    private JRadioButton jRadioButtonOption3;

    private JButton jButtonSendEmail;
    private JButton jButtonCreateExcel;


    public JPanelHome() {
        this.setLayout(null);

        jLabelTitle = new JLabel("Home");
        jLabelTitle.setBounds(10, 10, 100, 30);
        this.add(jLabelTitle);

        checkBoxAcceptTerm = new JCheckBox("Acepto términos y condiciones");
        checkBoxAcceptTerm.setBounds(10, 50, 200, 30);
        checkBoxAcceptTerm.addActionListener(e -> System.out.println(checkBoxAcceptTerm.isSelected()));
        this.add(checkBoxAcceptTerm);

        checkBoxAcceptTerm1 = new JCheckBox("Acepto términos y condiciones");
        checkBoxAcceptTerm1.setBounds(10, 100, 200, 30);
        checkBoxAcceptTerm1.addActionListener(e -> System.out.println(checkBoxAcceptTerm.isSelected()));
        this.add(checkBoxAcceptTerm1);

        checkBoxAcceptTerm2 = new JCheckBox("Acepto términos y condiciones");
        checkBoxAcceptTerm2.setBounds(10, 150, 200, 30);
        checkBoxAcceptTerm2.addActionListener(e -> System.out.println(checkBoxAcceptTerm.isSelected()));
        this.add(checkBoxAcceptTerm2);

        buttonGroup = new ButtonGroup();

        jRadioButtonOption1 = new JRadioButton("Opción 1");
        jRadioButtonOption1.setBounds(10, 200, 200, 30);
        jRadioButtonOption1.setActionCommand("OPTION1");
        jRadioButtonOption1.addActionListener(e -> System.out.println("Opción 1"));
        this.add(jRadioButtonOption1);
        buttonGroup.add(jRadioButtonOption1);

        jRadioButtonOption2 = new JRadioButton("Opción 2");
        jRadioButtonOption2.setBounds(10, 250, 200, 30);
        jRadioButtonOption2.addActionListener(e -> System.out.println("Opción 2"));
        this.add(jRadioButtonOption2);
        buttonGroup.add(jRadioButtonOption2);

        jRadioButtonOption3 = new JRadioButton("Opción 3");
        jRadioButtonOption3.setBounds(10, 300, 200, 30);
        jRadioButtonOption3.addActionListener(e -> System.out.println("Opción 3"));
        this.add(jRadioButtonOption3);
        buttonGroup.add(jRadioButtonOption3);

        jButtonSendEmail = new JButton("Enviar email");
        jButtonSendEmail.addActionListener(e -> sendEmail(
                "william.vega@uptc.edu.co",
                "Prueba programación II",
                "Este es el cuerpo del mensaje"
        ));
        jButtonSendEmail.setBounds(300, 100, 150, 30);
        this.add(jButtonSendEmail);

        String[][] matriz = new String[4][3];
        matriz[0][0] = "Id";
        matriz[0][1] = "Producto";
        matriz[0][2] = "Cantidad";

        matriz[1][0] = "asdasd1";
        matriz[1][1] = "asdasd1";
        matriz[1][2] = "asdasd1";

        matriz[2][0] = "asdasd2";
        matriz[2][1] = "asdasd2";
        matriz[2][2] = "asdasd2";

        jButtonCreateExcel = new JButton("Crear excel");
        jButtonCreateExcel.addActionListener(e -> createExcel(matriz));
        jButtonCreateExcel.setBounds(500, 100, 150, 30);
        this.add(jButtonCreateExcel);

    }

    private void sendEmail(String to, String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.sendgrid.net");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("apikey", "**********");
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("william.vega@uptc.edu.co"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(to)
            );   //Se podrían añadir varios de la misma manera
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
            System.out.println("ENVIADO");
        } catch (MessagingException me) {
            System.out.println(me);
            me.printStackTrace();   //Si se produce un error
        }
    }

    private void createExcel(String[][] data) {
        // Se crea el libro
        HSSFWorkbook book = new HSSFWorkbook();
        // Se crea una hoja dentro del libro
        HSSFSheet sheet = book.createSheet();
        for (int i = 0; i < data.length; i++) {
            // Se crea una fila dentro de la hoja
            HSSFRow fila = sheet.createRow(i);
            for (int j = 0; j < data[i].length; j++) {
                // Se crea una celda dentro de la fila
                HSSFCell cell = fila.createCell(j);
                // Se crea el contenido de la celda y se mete en ella.
                HSSFRichTextString texto = new HSSFRichTextString(data[i][j]);
                cell.setCellValue(texto);
            }
        }
        // Se crea el libro.
        try {
            FileOutputStream file = new FileOutputStream("reporte.xls"); // csv
            book.write(file);
            file.close();
            System.out.println("EXCEL CREADO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
