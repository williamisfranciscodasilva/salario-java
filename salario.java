import javax.swing.JOptionPane;
class salario
{
    public static void main(String args[])
    {
        float sal_bto, inss, sal_liq;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome do funcion�rio: ");
        sal_bto = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o sal�rio bruto do funcion�rio: "));
        inss = (sal_bto / 100) * 9;
        sal_liq = sal_bto - inss;

        JOptionPane.showMessageDialog(null,"Nome: "+nome+
        "\nSal�rio Bruto: "+sal_bto+"\nINSS: "+inss+
        "\nSal�rio l�quido: "+sal_liq);
        System.out.println("Nome: "+nome);
        System.out.println("Sal�rio Bruto: "+sal_bto);
        System.out.println("INSS: "+inss);
        System.out.println("Sal�rio l�quido: "+sal_liq);
    }
}