import java.util.Scanner;
public class mario
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("How high?");
        int hgt = k.nextInt();
        while (hgt <= 0 || hgt >= 99)
        {
            System.out.println("Input a valid number, please! D:<");
            hgt = k.nextInt();
        }
        if (hgt > 0 && hgt < 99)
        {
            String pyramid = "# #";
            String spacing = "";
            for (int x = 1; x < hgt; x++)
            {
                spacing = spacing + " ";
            }
            System.out.println(spacing + pyramid);
            if (hgt > 1)
            {
                spacing = spacing.substring(1);
                for (int i = 2; i <= hgt; i++)
                {
                    System.out.println(spacing + pyramid.substring(0,i-1) + "# #" + pyramid.substring(i));
                    pyramid = pyramid.substring(0,i-1) + "# #" + pyramid.substring(i);
                    if (spacing.length() > 0)
                    {
                        spacing = spacing.substring(0,spacing.length()-1);
                    }
                    else
                    {
                        spacing = "";
                    }
                }
            }
        }
    }
}
