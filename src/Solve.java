import java.lang.*;

class Solve {
    public static void main(String[] args) {
        solution("-_.~!@#$%^&*()=+[{]}:?,<>/");
    }
    public static String solution(String new_id) {
        String[] delete = {"~","!","@","#","\\$","%","\\^",",","&","\\*","\\(","\\)","\\+","=","\\\\","\\{","\\}","\\[","\\]",":","<",">","\\?","/"};
        System.out.println(new_id);
        //1단계
        new_id= new_id.toLowerCase();
        System.out.println("1단계 해결"+new_id);
        //2단계
        for (String item : delete) new_id=new_id.replaceAll(item,"");
        System.out.println("2단계 해결"+new_id);
        //3단계
        //StringBuffer temp_id= new StringBuffer(new_id+' ');
        StringBuffer temp_id= new StringBuffer(new_id);
        int dot_start = temp_id.indexOf("..");
        int dot_end = dot_start+1;
        while(dot_start >=0){
            while((dot_end<temp_id.length()-1)&&(temp_id.charAt(dot_end+1)=='.')) {dot_end++;System.out.println(dot_start+" "+dot_end);}
            temp_id=temp_id.delete(dot_start, dot_end);
            dot_start = temp_id.indexOf("..");
            dot_end = dot_start+1;
        } System.out.println("3단계 해결"+temp_id);
        //4단계
        if(temp_id.charAt(0)=='.') temp_id=temp_id.deleteCharAt(0);
        if(temp_id.length()>=1&& temp_id.charAt(temp_id.length()-1)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        System.out.println("4단계 해결"+temp_id);
        //5단계
        if(temp_id.length()==0) temp_id.insert(0,'a');
        System.out.println("5단계 해결"+temp_id);
        //6단계
        if(temp_id.length()>=16) temp_id=temp_id.delete(15, temp_id.length());
        if(temp_id.length()>=1&& temp_id.charAt(temp_id.length()-1)=='.') temp_id=temp_id.deleteCharAt(temp_id.length()-1);
        System.out.println("6단계 해결"+temp_id);
        //7단계
        while(temp_id.length()<3) temp_id.insert(temp_id.length(),temp_id.charAt(temp_id.length()-1));
        System.out.println("7단계 해결"+temp_id+" "+temp_id.length());
        return temp_id.toString();
    }
}
