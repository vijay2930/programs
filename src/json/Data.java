package json;
class Data {
    String phone_nos[];
    String nickname;
    String zuid;
    String first_name;
    long lmtime;
    long ctime;
    String id;
    Data(String[] phone_nos,String nickname,String zuid,String first_name,long lmtime,long ctime,String id){
        this.phone_nos=phone_nos;
        this.nickname=nickname;
        this.zuid=zuid;
        this.first_name=first_name;
        this.lmtime=lmtime;
        this.ctime=ctime;
        this.id=id;
    }
    String getnickname(){
        return this.nickname;
    }
}
