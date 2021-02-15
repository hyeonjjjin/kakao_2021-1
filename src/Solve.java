import java.lang.*;

class Solve {
    public static void main(String[] args) {
        solution("012345678901234567890123");
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
        //temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        System.out.println("3단계 해결"+temp_id);

        //4단계
        if(temp_id.charAt(0)=='.') temp_id=temp_id.deleteCharAt(0);
        if(temp_id.length()>=2&& temp_id.charAt(temp_id.length()-2)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-2);
        System.out.println("4단계 해결"+temp_id);

        //5단계 **앞서 맨 뒤에 ' '을 추가했음을 유의
        if(temp_id.length()==1) temp_id.append('a');
        System.out.println("5단계 해결"+temp_id);

        //6단계 **앞서 맨 뒤에 ' '을 추가했음을 유의
        if(temp_id.length()>=17) temp_id=temp_id.delete(15, temp_id.length()-1);
        System.out.println("6단계 해결"+temp_id);

        //
        System.out.println(new_id);
        String answer = "";
        return answer;
    }
}
