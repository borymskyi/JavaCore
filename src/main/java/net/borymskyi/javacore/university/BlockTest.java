//Блочный шифр Blowfish, в основе сеть Фейстеля.
//The Blowfish block cipher, based on the Feistel network.
package main.java.net.borymskyi.javacore.university;

public class BlockTest
{
    private static int rounds = 3;

    public void feist(int[] a, boolean reverse)
    {
        int round = reverse? rounds: 1;
        int l = a[0];
        int r = a[1];
        for (int i = 0; i < rounds; i++)
        {
            if (i < rounds - 1) // если не последний раунд
            {
                if (reverse == false & round == 1) {
                    System.out.println("Шифрование: ");
                }
                if (reverse == true & round == rounds) {
                    System.out.println("Расшифровка: ");
                }
                int t = l;
                l = r ^ f(l, round); //Берем R ксорим его с F получаем. Ставим результат на место L.
                r = t; //а на место R предыдущее значение L.
                System.out.println("Раунд: " + (i + 1) + "  |" + "Левый блок= " + l + "|  |" + "Правый блок= " + r + "| ");
            }
            else // последний раунд
            {
                r = r ^ f(l, round);
                System.out.println("Раунд: " + (i + 1) + "  |" + "Левый блок= " + l + "|  |" + "Правый блок= " + r + "| ");
            }
            if (reverse == false & round == 3) {
                System.out.println("-----------------------------------------------");
            }
            round += reverse? -1: 1;
        }
        a[0] = l;
        a[1] = r;
    }
    private int f(int b, int k)
    {
        return b + k;
    }
    public void test()
    {
        int[] a = new int[2];
        a[0] = 100;
        a[1] = 200;
        feist(a, false);
        feist(a, true);
    }

    public static void main(String[] args) {
        BlockTest b = new BlockTest();
        b.test();
    }
}