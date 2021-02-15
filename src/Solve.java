import java.lang.*;

class Solve {
    public static void main(String[] args) {
        solution("ab..!e.D!....");
    }
    public static String solution(String new_id) {
        String[] delete = {"~","`","!","@","#","\\$","%","\\^","&","\\*","\\(","\\)","\\+","=","\\|","\\\\","\\{","\\}","\\[","\\]",":",";", "\"","'","<",">","\\?","/"};
        System.out.println(new_id);
        //1단계
        new_id.toLowerCase();
        System.out.println("1단계 해결"+new_id);
        //2단계
        for (String item : delete) new_id=new_id.replaceAll(item,"");
        System.out.println("2단계 해결"+new_id);
        //3단계
        StringBuffer temp_id= new StringBuffer(new_id+' ');
        int dot_start = temp_id.indexOf("..");
        int dot_end = dot_start+1;
        while(dot_start >0){
            while(temp_id.charAt(dot_end+1)=='.') {dot_end++;}
            temp_id=temp_id.delete(dot_start, dot_end);
            dot_start = temp_id.indexOf("..");
            dot_end = dot_start+1;
        }


        System.out.println(new_id);
        String answer = "";
        return answer;
    }
}
