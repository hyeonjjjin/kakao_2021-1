import java.lang.*;

class Solve {
    public static void main(String[] args) {
        solution1("-_.~!@#$%^&*()=+[{]}:?,<>/");
        String[] orders= {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course= {2,3,4};
        solution2(orders,course);
    }
    public static String solution1(String new_id) {
        String[] delete = {"~","!","@","#","\\$","%","\\^",",","&","\\*","\\(","\\)","\\+","=","\\\\","\\{","\\}","\\[","\\]",":","<",">","\\?","/"};
        System.out.println(new_id);
        //1단계
        new_id= new_id.toLowerCase();
        //2단계
        for (String item : delete) new_id=new_id.replaceAll(item,"");
        //3단계
        StringBuffer temp_id= new StringBuffer(new_id);
        int dot_start = temp_id.indexOf("..");
        int dot_end = dot_start+1;
        while(dot_start >=0){
            while((dot_end<temp_id.length()-1)&&(temp_id.charAt(dot_end+1)=='.')) dot_end++;
            temp_id=temp_id.delete(dot_start, dot_end);
            dot_start = temp_id.indexOf("..");
            dot_end = dot_start+1;
        }
        //4단계
        if(temp_id.charAt(0)=='.') temp_id=temp_id.deleteCharAt(0);
        if(temp_id.length()>=1&& temp_id.charAt(temp_id.length()-1)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        //5단계
        if(temp_id.length()==0) temp_id.insert(0,'a');
        //6단계
        if(temp_id.length()>=16) temp_id=temp_id.delete(15, temp_id.length());
        if(temp_id.length()>=1&& temp_id.charAt(temp_id.length()-1)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        //7단계
        while(temp_id.length()<3) temp_id.insert(temp_id.length(),temp_id.charAt(temp_id.length()-1));
        return temp_id.toString();
    }

    public static String[] solution2(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }
}
