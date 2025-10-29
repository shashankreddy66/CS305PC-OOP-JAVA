import java.util.Scanner;
enum Fruits {
		
		Apple('a'), Banana('b'), citrus('c'),Dragonfruit('d'),Fig('e'),Grapes('f');
		private char a;
		Fruits(char a){
			this.a = a;

		}
		public char get(){
			return a;

		}
	}

	public class lab6p1{	
		public static void main(String...args){
				System.out.println("enter the value");
				Scanner s = new Scanner(System.in);
				String st = s.next();
				char ch = st.charAt(0);
				ch = Character.toLowerCase(ch);
				for(Fruits f:Fruits.values()){
					if(f.get() == ch){
						System.out.println(f);
					}
				}
			}
		}
	
