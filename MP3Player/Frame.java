import javax.swing.JFileChooser;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;

public class Frame implements ActionListener {
    private static JLabel header;
    private static JFrame frame;
    private static JPanel panel;
    private static JButton button;
    private static JButton select;
    private static JLabel info;
    private static JLabel imgLabel;

    public static void create() {
        URL url = Frame.class.getResource("img/icon.png");
        File file = new File(url.getPath());
        ImageIcon icon = new ImageIcon(file.getAbsolutePath());

        URL urlImg = Frame.class.getResource("img/img.png");
        File fileImg = new File(urlImg.getPath());
        ImageIcon img = new ImageIcon(fileImg.getAbsolutePath());

        panel = new JPanel();
        frame = new JFrame();
        new MP3();
        frame.setSize(300, 500);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MP3 Player");
        frame.add(panel);
        panel.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());

        header = new JLabel("MP3 Player");
        header.setBounds(60, 10, 400 ,40);
        header.setFont(new Font("Roboto", Font.BOLD, 30));
        panel.add(header);

        info = new JLabel("cro.wav");
        info.setBounds(190, 150, 100 ,25);
        info.setFont(new Font("Roboto", Font.PLAIN, 15));
        panel.add(info);

        imgLabel = new JLabel();
        imgLabel.setBounds(30, 210, 220 ,220);
        imgLabel.setIcon(img);
        panel.add(imgLabel);

        button = new JButton("Off");
        button.setBounds(100, 100, 80, 25);
        button.setBorder(new RoundedBorder(10));
        button.setFocusPainted(false);

        select = new JButton("Select");
        select.setBounds(100, 150, 80, 25);
        select.setBorder(new RoundedBorder(10));
        select.setFocusPainted(false);
        select.addActionListener(new Frame());
        panel.add(select);

        button.addMouseListener(new MouseCustomAdapter() {

            public void shortActionPerformed(MouseEvent e) {
                Main.pressedShort();
            }

            public void longActionPerformed(MouseEvent e)  {
                Main.pressedLong();
            }
        });

        panel.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(select)) {
            JFileChooser chooser = new JFileChooser();
            URL url = MP3.class.getResource("audio");
            File file = new File(url.getPath());
            chooser.setCurrentDirectory(file);
            chooser.setFileFilter(new FileFilter() {

                public String getDescription() {
                    return "wav audio (*.wav)";
                }

                public boolean accept(File f) {
                    if (f.isDirectory()) {
                        return true;
                    } else {
                        String filename = f.getName().toLowerCase();
                        return filename.endsWith(".wav") ;
                    }
                }
            });
            int val = chooser.showOpenDialog(null);

            if(val == JFileChooser.APPROVE_OPTION)
            {
                MP3.filename = chooser.getSelectedFile().getName();
                info.setText(chooser.getSelectedFile().getName());
                MP3.stop();
                Main.status = "off";
                button.setText("Off");
            }
        }
    }

    public static void setButtonText(String text) {
        button.setText(text);
    }

    private static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}