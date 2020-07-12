package com.sunbeam.utility;

import java.util.Properties;    
import javax.mail.*;  
import javax.mail.internet.*;

public class MailUtility{  
    public static void send(String from,String password,String to){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password);  
           }
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject("Registration");
           Object obj = new Object();
           obj = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\n" +
        		   "    <!--[if gte mso 9]><xml>\n" +
        		   "     <o:OfficeDocumentSettings>\n" +
        		   "      <o:AllowPNG/>\n" +
        		   "      <o:PixelsPerInch>96</o:PixelsPerInch>\n" +
        		   "     </o:OfficeDocumentSettings>\n" +
        		   "    </xml><![endif]-->\n" +
        		   "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
        		   "    <meta name=\"viewport\" content=\"width=device-width\">\n" +
        		   "    <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\n" +
        		   "    <title></title>\n" +
        		   "    <!--[if !mso]><!-- -->\n" +
        		   "\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\n" +
        		   "\t<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\n" +
        		   "\t<!--<![endif]-->\n" +
        		   "    \n" +
        		   "    <style type=\"text/css\" id=\"media-query\">\n" +
        		   "      body {\n" +
        		   "  margin: 0;\n" +
        		   "  padding: 0; }\n" +
        		   "\n" +
        		   "table, tr, td {\n" +
        		   "  vertical-align: top;\n" +
        		   "  border-collapse: collapse; }\n" +
        		   "\n" +
        		   ".ie-browser table, .mso-container table {\n" +
        		   "  table-layout: fixed; }\n" +
        		   "\n" +
        		   "* {\n" +
        		   "  line-height: inherit; }\n" +
        		   "\n" +
        		   "a[x-apple-data-detectors=true] {\n" +
        		   "  color: inherit !important;\n" +
        		   "  text-decoration: none !important; }\n" +
        		   "\n" +
        		   "[owa] .img-container div, [owa] .img-container button {\n" +
        		   "  display: block !important; }\n" +
        		   "\n" +
        		   "[owa] .fullwidth button {\n" +
        		   "  width: 100% !important; }\n" +
        		   "\n" +
        		   "[owa] .block-grid .col {\n" +
        		   "  display: table-cell;\n" +
        		   "  float: none !important;\n" +
        		   "  vertical-align: top; }\n" +
        		   "\n" +
        		   ".ie-browser .num12, .ie-browser .block-grid, [owa] .num12, [owa] .block-grid {\n" +
        		   "  width: 600px !important; }\n" +
        		   "\n" +
        		   ".ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div {\n" +
        		   "  line-height: 100%; }\n" +
        		   "\n" +
        		   ".ie-browser .mixed-two-up .num4, [owa] .mixed-two-up .num4 {\n" +
        		   "  width: 200px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .mixed-two-up .num8, [owa] .mixed-two-up .num8 {\n" +
        		   "  width: 400px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.two-up .col, [owa] .block-grid.two-up .col {\n" +
        		   "  width: 300px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.three-up .col, [owa] .block-grid.three-up .col {\n" +
        		   "  width: 200px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.four-up .col, [owa] .block-grid.four-up .col {\n" +
        		   "  width: 150px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.five-up .col, [owa] .block-grid.five-up .col {\n" +
        		   "  width: 120px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.six-up .col, [owa] .block-grid.six-up .col {\n" +
        		   "  width: 100px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.seven-up .col, [owa] .block-grid.seven-up .col {\n" +
        		   "  width: 85px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.eight-up .col, [owa] .block-grid.eight-up .col {\n" +
        		   "  width: 75px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.nine-up .col, [owa] .block-grid.nine-up .col {\n" +
        		   "  width: 66px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.ten-up .col, [owa] .block-grid.ten-up .col {\n" +
        		   "  width: 60px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.eleven-up .col, [owa] .block-grid.eleven-up .col {\n" +
        		   "  width: 54px !important; }\n" +
        		   "\n" +
        		   ".ie-browser .block-grid.twelve-up .col, [owa] .block-grid.twelve-up .col {\n" +
        		   "  width: 50px !important; }\n" +
        		   "\n" +
        		   "@media only screen and (min-width: 620px) {\n" +
        		   "  .block-grid {\n" +
        		   "    width: 600px !important; }\n" +
        		   "  .block-grid .col {\n" +
        		   "    vertical-align: top; }\n" +
        		   "    .block-grid .col.num12 {\n" +
        		   "      width: 600px !important; }\n" +
        		   "  .block-grid.mixed-two-up .col.num4 {\n" +
        		   "    width: 200px !important; }\n" +
        		   "  .block-grid.mixed-two-up .col.num8 {\n" +
        		   "    width: 400px !important; }\n" +
        		   "  .block-grid.two-up .col {\n" +
        		   "    width: 300px !important; }\n" +
        		   "  .block-grid.three-up .col {\n" +
        		   "    width: 200px !important; }\n" +
        		   "  .block-grid.four-up .col {\n" +
        		   "    width: 150px !important; }\n" +
        		   "  .block-grid.five-up .col {\n" +
        		   "    width: 120px !important; }\n" +
        		   "  .block-grid.six-up .col {\n" +
        		   "    width: 100px !important; }\n" +
        		   "  .block-grid.seven-up .col {\n" +
        		   "    width: 85px !important; }\n" +
        		   "  .block-grid.eight-up .col {\n" +
        		   "    width: 75px !important; }\n" +
        		   "  .block-grid.nine-up .col {\n" +
        		   "    width: 66px !important; }\n" +
        		   "  .block-grid.ten-up .col {\n" +
        		   "    width: 60px !important; }\n" +
        		   "  .block-grid.eleven-up .col {\n" +
        		   "    width: 54px !important; }\n" +
        		   "  .block-grid.twelve-up .col {\n" +
        		   "    width: 50px !important; } }\n" +
        		   "\n" +
        		   "@media (max-width: 620px) {\n" +
        		   "  .block-grid, .col {\n" +
        		   "    min-width: 320px !important;\n" +
        		   "    max-width: 100% !important;\n" +
        		   "    display: block !important; }\n" +
        		   "  .block-grid {\n" +
        		   "    width: calc(100% - 40px) !important; }\n" +
        		   "  .col {\n" +
        		   "    width: 100% !important; }\n" +
        		   "    .col > div {\n" +
        		   "      margin: 0 auto; }\n" +
        		   "  img.fullwidth, img.fullwidthOnMobile {\n" +
        		   "    max-width: 100% !important; }\n" +
        		   "  .no-stack .col {\n" +
        		   "    min-width: 0 !important;\n" +
        		   "    display: table-cell !important; }\n" +
        		   "  .no-stack.two-up .col {\n" +
        		   "    width: 50% !important; }\n" +
        		   "  .no-stack.mixed-two-up .col.num4 {\n" +
        		   "    width: 33% !important; }\n" +
        		   "  .no-stack.mixed-two-up .col.num8 {\n" +
        		   "    width: 66% !important; }\n" +
        		   "  .no-stack.three-up .col.num4 {\n" +
        		   "    width: 33% !important; }\n" +
        		   "  .no-stack.four-up .col.num3 {\n" +
        		   "    width: 25% !important; } }\n" +
        		   "\n" +
        		   "    </style>\n" +
        		   "</head>\n" +
        		   "<body class=\"clean-body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #FFFFFF\">\n" +
        		   "  <style type=\"text/css\" id=\"media-query-bodytag\">\n" +
        		   "    @media (max-width: 520px) {\n" +
        		   "      .block-grid {\n" +
        		   "        min-width: 320px!important;\n" +
        		   "        max-width: 100%!important;\n" +
        		   "        width: 100%!important;\n" +
        		   "        display: block!important;\n" +
        		   "      }\n" +
        		   "\n" +
        		   "      .col {\n" +
        		   "        min-width: 320px!important;\n" +
        		   "        max-width: 100%!important;\n" +
        		   "        width: 100%!important;\n" +
        		   "        display: block!important;\n" +
        		   "      }\n" +
        		   "\n" +
        		   "        .col > div {\n" +
        		   "          margin: 0 auto;\n" +
        		   "        }\n" +
        		   "\n" +
        		   "      img.fullwidth {\n" +
        		   "        max-width: 100%!important;\n" +
        		   "      }\n" +
        		   "\t\t\timg.fullwidthOnMobile {\n" +
        		   "        max-width: 100%!important;\n" +
        		   "      }\n" +
        		   "      .no-stack .col {\n" +
        		   "\t\t\t\tmin-width: 0!important;\n" +
        		   "\t\t\t\tdisplay: table-cell!important;\n" +
        		   "\t\t\t}\n" +
        		   "\t\t\t.no-stack.two-up .col {\n" +
        		   "\t\t\t\twidth: 50%!important;\n" +
        		   "\t\t\t}\n" +
        		   "\t\t\t.no-stack.mixed-two-up .col.num4 {\n" +
        		   "\t\t\t\twidth: 33%!important;\n" +
        		   "\t\t\t}\n" +
        		   "\t\t\t.no-stack.mixed-two-up .col.num8 {\n" +
        		   "\t\t\t\twidth: 66%!important;\n" +
        		   "\t\t\t}\n" +
        		   "\t\t\t.no-stack.three-up .col.num4 {\n" +
        		   "\t\t\t\twidth: 33%!important\n" +
        		   "\t\t\t}\n" +
        		   "\t\t\t.no-stack.four-up .col.num3 {\n" +
        		   "\t\t\t\twidth: 25%!important\n" +
        		   "\t\t\t}\n" +
        		   "    }\n" +
        		   "  </style>\n" +
        		   "  <!--[if IE]><div class=\"ie-browser\"><![endif]-->\n" +
        		   "  <!--[if mso]><div class=\"mso-container\"><![endif]-->\n" +
        		   "  <table class=\"nl-container\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #FFFFFF;width: 100%\" cellpadding=\"0\" cellspacing=\"0\">\n" +
        		   "\t<tbody>\n" +
        		   "\t<tr style=\"vertical-align: top\">\n" +
        		   "\t\t<td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
        		   "    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #FFFFFF;\"><![endif]-->\n" +
        		   "\n" +
        		   "    <div style=\"background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-image:url('images/sayagata-200px.gif');background-position:top center;background-repeat:repeat;;background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-image:url('images/sayagata-200px.gif');background-position:top center;background-repeat:repeat;;background-color:transparent\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:15px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:15px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 30px; padding-bottom: 5px;\"><![endif]-->\n" +
        		   "<div style=\"font-family:'Montserrat', 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;line-height:120%;color:#555555; padding-right: 10px; padding-left: 10px; padding-top: 30px; padding-bottom: 5px;\">\t\n" +
        		   "\t<div style=\"font-size:12px;line-height:14px;font-family:Montserrat, 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;color:#555555;text-align:left;\"><p style=\"margin: 0;font-size: 12px;line-height: 14px;text-align: center\"><span style=\"font-size: 48px; line-height: 57px;\"><strong><span style=\"line-height: 57px; font-size: 48px;\">WELCOME</span></strong></span></p></div>\t\n" +
        		   "</div>\n" +
        		   "<!--[if mso]></td></tr></table><![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 15px;padding-bottom: 20px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"15%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 10px solid #66C7E5;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 5px; padding-bottom: 10px;\"><![endif]-->\n" +
        		   "<div style=\"font-family:'Montserrat', 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;line-height:120%;color:#555555; padding-right: 10px; padding-left: 10px; padding-top: 5px; padding-bottom: 10px;\">\t\n" +
        		   "\t<div style=\"font-size:12px;line-height:14px;font-family:Montserrat, 'Trebuchet MS', 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', Tahoma, sans-serif;color:#555555;text-align:left;\"><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><span style=\"font-size: 20px; line-height: 24px;\"><strong>Thanks for signing up!</strong> </span><br></p></div>\t\n" +
        		   "</div>\n" +
        		   "<!--[if mso]></td></tr></table><![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 25px; padding-left: 25px; padding-top: 5px; padding-bottom: 20px;\"><![endif]-->\n" +
        		   "<div style=\"font-family:'Lato', Tahoma, Verdana, Segoe, sans-serif;line-height:180%;color:#555555; padding-right: 25px; padding-left: 25px; padding-top: 5px; padding-bottom: 20px;\">\t\n" +
        		   "\t<div style=\"line-height:22px;font-size:12px;color:#555555;font-family:'Lato', Tahoma, Verdana, Segoe, sans-serif;text-align:left;\"><p style=\"margin: 0;line-height: 22px;text-align: center;font-size: 12px\"><span style=\"font-size: 16px; line-height: 28px;\">Lets hope for a better world by serving the needy who we can. The world with a little of love is more prominent then the world without it</span></p></div>\t\n" +
        		   "</div>\n" +
        		   "<!--[if mso]></td></tr></table><![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:0px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:0px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    &#160;\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:transparent;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:10px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:10px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:#F9F9F9;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#F9F9F9;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:5px; padding-bottom:5px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:5px; padding-bottom:5px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <div align=\"center\" class=\"img-container center  autowidth \" style=\"padding-right: 0px;  padding-left: 0px;\">\n" +
        		   "<!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 0px; padding-left: 0px;\" align=\"center\"><![endif]-->\n" +
        		   "<div style=\"line-height:20px;font-size:1px\">&#160;</div>  <img class=\"center  autowidth \" align=\"center\" border=\"0\" src=\"images/icon.png\" alt=\"Email Design Workshop\" title=\"Email Design Workshop\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: 0;height: auto;float: none;width: 100%;max-width: 59px\" width=\"59\">\n" +
        		   "<div style=\"line-height:5px;font-size:1px\">&#160;</div><!--[if mso]></td></tr></table><![endif]-->\n" +
        		   "</div>\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
        		   "<div style=\"font-family:'Lato', Tahoma, Verdana, Segoe, sans-serif;line-height:120%;color:#66C7E5; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\">\t\n" +
        		   "\t<div style=\"font-size:12px;line-height:14px;color:#66C7E5;font-family:'Lato', Tahoma, Verdana, Segoe, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><span style=\"font-size: 16px; line-height: 19px; color: rgb(102, 199, 229);\"><strong>Jaffe.io</strong></span></p><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><span style=\"font-size: 16px; line-height: 19px; color: rgb(102, 199, 229);\"><strong><br data-mce-bogus=\"1\"></strong></span></p></div>\t\n" +
        		   "</div>\n" +
        		   "<!--[if mso]></td></tr></table><![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    \n" +
        		   "<div align=\"center\" style=\"padding-right: 10px; padding-left: 10px; padding-bottom: 15px;\">\n" +
        		   "  <div style=\"line-height:10px;font-size:1px\">&#160;</div>\n" +
        		   "  <div style=\"display: table; max-width:225px;\">\n" +
        		   "  <!--[if (mso)|(IE)]><table width=\"205\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse; padding-right: 10px; padding-left: 10px; padding-bottom: 15px;\"  align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:205px;\"><tr><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
        		   "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 5px\">\n" +
        		   "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
        		   "        <a href=\"https://www.facebook.com/\" title=\"Facebook\" target=\"_blank\">\n" +
        		   "          <img src=\"images/facebook@2x.png\" alt=\"Facebook\" title=\"Facebook\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
        		   "        </a>\n" +
        		   "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
        		   "      </td></tr>\n" +
        		   "    </tbody></table>\n" +
        		   "      <!--[if (mso)|(IE)]></td><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
        		   "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 5px\">\n" +
        		   "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
        		   "        <a href=\"https://twitter.com/\" title=\"Twitter\" target=\"_blank\">\n" +
        		   "          <img src=\"images/twitter@2x.png\" alt=\"Twitter\" title=\"Twitter\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
        		   "        </a>\n" +
        		   "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
        		   "      </td></tr>\n" +
        		   "    </tbody></table>\n" +
        		   "      <!--[if (mso)|(IE)]></td><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
        		   "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 5px\">\n" +
        		   "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
        		   "        <a href=\"https://www.youtube.com/\" title=\"YouTube\" target=\"_blank\">\n" +
        		   "          <img src=\"images/youtube@2x.png\" alt=\"YouTube\" title=\"YouTube\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
        		   "        </a>\n" +
        		   "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
        		   "      </td></tr>\n" +
        		   "    </tbody></table>\n" +
        		   "      <!--[if (mso)|(IE)]></td><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\n" +
        		   "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 5px\">\n" +
        		   "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
        		   "        <a href=\"https://www.pinterest.com/\" title=\"Pinterest\" target=\"_blank\">\n" +
        		   "          <img src=\"images/pinterest@2x.png\" alt=\"Pinterest\" title=\"Pinterest\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
        		   "        </a>\n" +
        		   "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
        		   "      </td></tr>\n" +
        		   "    </tbody></table>\n" +
        		   "      <!--[if (mso)|(IE)]></td><td width=\"32\" style=\"width:32px; padding-right: 0;\" valign=\"top\"><![endif]-->\n" +
        		   "    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;Margin-right: 0\">\n" +
        		   "      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\n" +
        		   "        <a href=\"https://telegram.org\" title=\"Telegram\" target=\"_blank\">\n" +
        		   "          <img src=\"images/telegram@2x.png\" alt=\"Telegram\" title=\"Telegram\" width=\"32\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: block !important;border: none;height: auto;float: none;max-width: 32px !important\">\n" +
        		   "        </a>\n" +
        		   "      <div style=\"line-height:5px;font-size:1px\">&#160;</div>\n" +
        		   "      </td></tr>\n" +
        		   "    </tbody></table>\n" +
        		   "    <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "  </div>\n" +
        		   "</div>\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 0px;padding-left: 0px;padding-top: 0px;padding-bottom: 15px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #EEEDED;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "                  \n" +
        		   "                    <!--[if mso]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\"><![endif]-->\n" +
        		   "<div style=\"font-family:'Lato', Tahoma, Verdana, Segoe, sans-serif;line-height:120%;color:#555555; padding-right: 10px; padding-left: 10px; padding-top: 10px; padding-bottom: 10px;\">\t\n" +
        		   "\t<div style=\"font-size:12px;line-height:14px;color:#555555;font-family:'Lato', Tahoma, Verdana, Segoe, sans-serif;text-align:left;\"><p style=\"margin: 0;font-size: 14px;line-height: 17px;text-align: center\"><strong>© 2017 Jaffe Inc.</strong> All rights reserved</p></div>\t\n" +
        		   "</div>\n" +
        		   "<!--[if mso]></td></tr></table><![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>    <div style=\"background-color:#F9F9F9;\">\n" +
        		   "      <div style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\" class=\"block-grid \">\n" +
        		   "        <div style=\"border-collapse: collapse;display: table;width: 100%;background-color:transparent;\">\n" +
        		   "          <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"background-color:#F9F9F9;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width: 600px;\"><tr class=\"layout-full-width\" style=\"background-color:transparent;\"><![endif]-->\n" +
        		   "\n" +
        		   "              <!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" style=\" width:600px; padding-right: 0px; padding-left: 0px; padding-top:15px; padding-bottom:0px; border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent;\" valign=\"top\"><![endif]-->\n" +
        		   "            <div class=\"col num12\" style=\"min-width: 320px;max-width: 600px;display: table-cell;vertical-align: top;\">\n" +
        		   "              <div style=\"background-color: transparent; width: 100% !important;\">\n" +
        		   "              <!--[if (!mso)&(!IE)]><!--><div style=\"border-top: 0px solid transparent; border-left: 0px solid transparent; border-bottom: 0px solid transparent; border-right: 0px solid transparent; padding-top:15px; padding-bottom:0px; padding-right: 0px; padding-left: 0px;\"><!--<![endif]-->\n" +
        		   "\n" +
        		   "                  \n" +
        		   "                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"divider\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 100%;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "    <tbody>\n" +
        		   "        <tr style=\"vertical-align: top\">\n" +
        		   "            <td class=\"divider_inner\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;padding-right: 10px;padding-left: 10px;padding-top: 10px;padding-bottom: 10px;min-width: 100%;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                <table class=\"divider_content\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 0px solid transparent;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                    <tbody>\n" +
        		   "                        <tr style=\"vertical-align: top\">\n" +
        		   "                            <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\n" +
        		   "                                <span></span>\n" +
        		   "                            </td>\n" +
        		   "                        </tr>\n" +
        		   "                    </tbody>\n" +
        		   "                </table>\n" +
        		   "            </td>\n" +
        		   "        </tr>\n" +
        		   "    </tbody>\n" +
        		   "</table>\n" +
        		   "                  \n" +
        		   "              <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\n" +
        		   "              </div>\n" +
        		   "            </div>\n" +
        		   "          <!--[if (mso)|(IE)]></td></tr></table></td></tr></table><![endif]-->\n" +
        		   "        </div>\n" +
        		   "      </div>\n" +
        		   "    </div>   <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\n" +
        		   "\t\t</td>\n" +
        		   "  </tr>\n" +
        		   "  </tbody>\n" +
        		   "  </table>\n" +
        		   "  <!--[if (mso)|(IE)]></div><![endif]-->\n" +
        		   "\n" +
        		   "\n" +
        		   "</body></html>";
           //send message  
           message.setContent(obj, "text/html");
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);}    
             
    }  
}  
/*public class SendMailSSL{    
 public static void main(String[] args) {    
     //from,password,to,subject,message  
     Mailer.send("from@gmail.com","xxxxx","to@gmail.com","hello javatpoint","How r u?");  
     //change from, password and to  
 }    
}  */