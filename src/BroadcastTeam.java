public class BroadcastTeam {
    String[] team = new String[20];
    String[] member = new String[100];
    int memberCount = 0;
    String[] camera;
    String[] speaker;
    String[] mic;
    String[] computer;

    void broadcasting(String type) {
        System.out.println(type + "방송을 시작합니다");
    }
    void addNewMember(String member){
        this.member[memberCount++] = member;
    }
    void showMember(){
        for(int i=0;i<memberCount;i++){
            System.out.println(member[i]);
        }
    }
}