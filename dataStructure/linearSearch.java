import java.util.Scanner;

    public class linearSearch {
        public static void main(String[] args) {
            int[] arr = {11, 8, 20, 10, 233, 74, 20, 89, 37, 43};
            int item,flag=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Item to be search ?");
            item = sc.nextInt();
            for(int i = 0; i<12; i++)
            {
                if(arr[i]==item)
                {
                    flag = i+1;
                    break;
                }
                else
                    flag = 0;
            }
            if(flag != 0)
            {
                System.out.println("Item found at location : " + flag);
            }
            else
                System.out.println("Item not found");

        }
    }

