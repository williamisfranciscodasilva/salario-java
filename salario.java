import javax.swing.JOptionPane;
class salario
{
    public static void main(String args[])
    {
        float sal_bto, inss, sal_liq;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
        sal_bto = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o salário bruto do funcionário: "));
        inss = (sal_bto / 100) * 9;
        sal_liq = sal_bto - inss;

        JOptionPane.showMessageDialog(null,"Nome: "+nome+
        "\nSalário Bruto: "+sal_bto+"\nINSS: "+inss+
        "\nSalário líquido: "+sal_liq);
        System.out.println("Nome: "+nome);
        System.out.println("Salário Bruto: "+sal_bto);
        System.out.println("INSS: "+inss);
        System.out.println("Salário líquido: "+sal_liq);
    }
}