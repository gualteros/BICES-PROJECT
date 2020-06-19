package com.bices.backend.models;


public class HomePage {

    private String mensajePrincipal;
    private String viñeta1;
    private String viñeta2;
    private String viñeta3;
    private String viñeta4;
    private String testimonio1;
    private String testimonio2;
    private String testimonio3;
    private String contactanos;

    public HomePage(String mensajePrincipal,String viñeta1, String viñeta2, String viñeta3, String viñeta4, String testimonio1, String testimonio2, String testimonio3, String contactanos ){
        super();
        this.mensajePrincipal = mensajePrincipal;
        this.viñeta1=viñeta1;
        this.viñeta2=viñeta2;
        this.viñeta3=viñeta3;
        this.viñeta4=viñeta4;
        this.testimonio1=testimonio1;
        this.testimonio2=testimonio2;
        this.testimonio3=testimonio3;
        this.contactanos=contactanos;

    }

    public String getMensajePrincipal(){
        return mensajePrincipal;
    }

    public void setMensajePrincipal(String mensajePrincipal){
        this.mensajePrincipal = mensajePrincipal;
    }

    public String getViñeta1(){
        return viñeta1;
    }

    public void setViñeta1(String viñeta1){
        this.viñeta1 = viñeta1;
    }
    public String getViñeta2(){
        return viñeta2;
    }

    public void setViñeta2(String viñeta2){
        this.viñeta2 = viñeta2;
    }
    public String getViñeta3(){
        return viñeta3;
    }

    public void setViñeta3(String viñeta3){
        this.viñeta3 = viñeta3;
    }
    public String getViñeta4(){
        return viñeta4;
    }

    public void setViñeta4(String viñeta4){
        this.viñeta4 = viñeta4;
    }
    public String getTestimonio1(){
        return testimonio1;
    }

    public void setTestimonio1(String testimonio1){
        this.testimonio1 = testimonio1;
    }

    public String getTestimonio2(){
        return testimonio2;
    }

    public void setTestimonio2(String testimonio2){
        this.testimonio2 = testimonio2;
    }

    public String getTestimonio3(){
        return testimonio3;
    }

    public void setTestimonio3(String testimonio3){
        this.testimonio3 = testimonio3;
    }

    public String getContactanos(){
        return contactanos;
    }

    public void setContactanos(String contactanos){
        this.contactanos = contactanos;
    }

}