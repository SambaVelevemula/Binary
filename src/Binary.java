import java.util.Scanner;
class Node{
	public int mainkey;
	public String value;
	public Node left,right;
	public Node(int mainkey,String value){
		this.mainkey=mainkey;
		this.value=value;
	}
	public void add1(int key,String value){
		if(key<mainkey){
			if(left==null){
				left=new Node(key,value);
			}else{
				left.add1(key,value);
			}
		}else if(key>mainkey){
			if(right==null){
				right=new Node(key,value);
			}else{
				right.add1(key,value);
			}
		}else{
			this.value=value;
		}
	}
	public String search1(int key){
		if(key==mainkey){
			return value;
		}else if(key<mainkey){
			if(left==null){
				return null;
			}else{
				return left.search1(key);
			}
		}else if(key>mainkey){
			if(right==null){
				return null;
			}else{return right.search1(key);}
		}else{return null;
		}
	}
}

public class Binary{
	Node root;
	public void add(int key,String value){
		if(root==null){
			root=new Node(key, value);
		}else{
			root.add1(key,value);
		}
	}
	public String search(int key){
		if(root==null){
			return null;
		}else{
			return root.search1(key);
		}
	}
	public static void main(String []arg){
		Binary b=new Binary();
		b.add( 4," Samba");
		b.add( 9,"Siva");
		b.add( 3,"Rao");
		b.add( 2,"Kiran");
		b.add( 5,"Srikanth");
		b.add( 7,"Anil");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Key to Search :");
		int n=sc.nextInt();
		String s=b.search(n);
		System.out.println("key :"+n+" value is :"+s);
		if(s==null) {
			System.out.println("Enter Keys in(4, 9, 3, 2, 5, 7) :");
			n=sc.nextInt();
			String s1=b.search(n);
			System.out.println("key :"+n+" value is :"+s1);
		}
		
	}
}