/*1~5까지 일렬로 출력후
각 숫자 사이사이마다 1~3 삽입(단, 4까지만 적용)*/

public class a20171214_04{
public static void main(String args[]){
int a=1,b=1;
while(a<=5){
System.out.println(a);
if(a<=4)
while(b<=3){
System.out.println(b);
b++;
}
a++;
b=1;
}

}
}


