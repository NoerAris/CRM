/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.swing;

/**
 *
 * @author user
 */
public class Nasabah implements Comparable<Nasabah>{
    private String id;
    private String name;
    private String gender;
    private Boolean married;
    private Integer age;
    private String noTelepon;
    private String alamat;

    public Nasabah(String id, String name, String gender, Boolean married, Integer age, String noTelepon, String alamat) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }

   

    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the noTelepon
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * @param noTelepon the noTelepon to set
     */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Nasabah o) {
        return id.compareTo(o.id);
    }
    
    
    
      
   
}
