import java.lang.*;

class Solve {
    public static void main(String[] args) {
        solution("{({{\\\\|\\|+|+==(=+))@()#$-_%%$%^^^&&a&**^*`b!e!..<><}.}}[[][]]::;;\"'?");
    }
    public static String solution(String new_id) {
        String[] delete = {"~","`","!","@","#","\\$","%","\\^","&","\\*","\\(","\\)","\\+","=","\\|","\\\\","\\{","\\}","\\[","\\]",":",";", "\"","'","<",">","\\?","/"};
        System.out.println(new_id);
        //1단계
        new_id.toLowerCase();
        //2단계
        for (String item : delete) new_id=new_id.replaceAll(item,"");
        //3단계


        System.out.println(new_id);
        String answer = "";
        return answer;
    }
}
