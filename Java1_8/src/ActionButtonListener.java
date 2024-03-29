import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonListener implements ActionListener {
    private JTextField outField;
    private StringBuilder sb;

    public ActionButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();

        if (jButton.getText().equals("C")) {
            outField.setText("");
            return;
        }

        String val = sb.append(outField.getText())
                .append(jButton.getText())
                .toString();
        outField.setText(val);
        sb.setLength(0);

    }
}
