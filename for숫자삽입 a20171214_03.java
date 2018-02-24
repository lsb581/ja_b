/*1~5까지 일렬로 출력후
각 숫자 사이사이마다 1~5 삽입(단, 4까지만 적용)*/

public class a20171214_03{
public static void main(String args[]){
for(int a=1; a<=5; a++){
System.out.println(a);
if(a<=4)
for(int b=1; b<=5; b++){
System.out.println(b);
}
}

}
}


