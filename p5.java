public class p-5{

public static void main(String[]args){
int num = 123;
String result = p-5(num);

System.out.println("Number in words:" + result);
}

public static String p-5(int num){
String[]words={
"Zero","One","Two","Three","Four","Five","six","Seven","Eight","Nine"
};

String word="";
int rev=();

int temp = num;

while(temp != 0 ){
rev = rev * 10 + temp % 10;
temp = temp / 10;
}

while(rev !=0){
int digit = rev % 10;
word += words[digit]+"";
rev= rev / 10;
}

return word.trim();
}
}