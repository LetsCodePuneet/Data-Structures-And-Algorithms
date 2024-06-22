import java.util.Scanner;
public class Main
{
    public static void squarePattern(int n){
        System.out.println("Square Pattern for "+n+" number of rows:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(n+"\t");
            }
            System.out.println("");
        }
    }
    
    public static void triangleStarPattern(int n){
        System.out.println("Triangle Star Pattern for "+n+" number of rows:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                 System.out.print("*\t");
            }
            System.out.println("");
        }
    }
    
    public static void triangleNumberPattern(int n){
        System.out.println("Triangle Number Pattern for "+n+" number of rows:\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                 System.out.print((i+1)+"\t");
            }
            System.out.println("");
        }
    }
    
    public static void reverseNumberPattern(int n){
        System.out.println("Reverse Number Pattern for "+n+" number of rows:\n");
        for(int i=0;i<n;i++){
            int k=i+1;
            for(int j=0;j<=i;j++){
                 System.out.print((k)+"\t");
                 k--;
            }
            System.out.println("");
        }
    }
    
    public static void alphaPattern(int n){
        if(n>26){
            System.out.println("Please enter row number less than or equal to 26 only.");
            return;
        }
        System.out.println("Alpha Pattern for "+n+" number of rows:\n");
        char c = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                 System.out.print(((char) (c+i))+"\t");
            }
            System.out.println("");
        }
    }
    
    public static void characterPattern(int n){
        if(n>13){
            System.out.println("Please enter row number less than or equal to 13 only.");
            return;
        }
        System.out.println("Character Pattern for "+n+" number of rows:\n");
        for(int i=0;i<n;i++){
            char d = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(d+"\t");
                d++;
            }
            System.out.println("");
        }
    }
    
    public static void interestingAlphabets(int n){
        if(n>26){
            System.out.println("Please enter row number less than or equal to 26 only.");
            return;
        }
        System.out.println("Intersting Alphabets Pattern for "+n+" number of rows:\n");
        
        for(int i=0;i<n;i++){
            char c = (char) ('A'+n);
            for(int j=0;j<=i;j++){
                 System.out.print((char)(c-(i+1))+"\t");
                 ++c;
            }
            System.out.println("");
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Please enter number of rows:");
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        squarePattern(n);
        triangleStarPattern(n);
        triangleNumberPattern(n);
        reverseNumberPattern(n);
        alphaPattern(n);
        characterPattern(n);
        interestingAlphabets(n);
	}
}