package BildBearbeitung;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;
import  javax.imageio.stream.ImageInputStreamImpl;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class BildEinlesen {

    public static void main(String[] args) throws IOException {

        InputStream f = new BufferedInputStream(new FileInputStream("/home/philipp/IdeaProjects/Private/src/BildBearbeitung/bird.jpg"));
        Image image = ImageIO.read(f);

        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        System.out.println(f.read());

    }



}
