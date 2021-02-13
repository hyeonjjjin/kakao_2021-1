import java.lang.*;

class Solve {
    public static void main(String[] args) {
        solution("ab...!eD!..");
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
        int dot=new_id.indexOf('.');
        int dotdot =dot;
        String temp_id = new_id;
        String tmp = "";
        while(dot>0){
            while(temp_id.charAt(1+dotdot++)=='.')System.out.println("ovo"); //dotdot++;//{dotdot+=1;}
            //System.out.println("ovo?");
            //System.out.println(dotdot);
            //System.out.println(temp_id.substring(dot,dotdot));
            tmp = tmp.replaceAll("\\.","");
            for(int i=0;i<dotdot-dot;i++) tmp=tmp+"\\.";
            System.out.println(tmp);

            new_id=temp_id.replaceAll(tmp,"!");//new_id.substring(dot,dotdot+1)
            System.out.println("3단계 해결중"+new_id);
            //System.out.println("3단계 해결중 temp"+temp_id);
            System.out.println(temp_id.substring(dotdot,temp_id.length()));
            temp_id=temp_id.substring(dotdot,temp_id.length()+1);
            dotdot = dot = temp_id.indexOf('.');
            System.out.println("옦꼐"+dot+" "+dotdot+ " "+ temp_id.length());
        }

        //new_id=new_id.replaceAll("\\.\\.","\\.");



        System.out.println(new_id);
        String answer = "";
        return answer;
    }
}
