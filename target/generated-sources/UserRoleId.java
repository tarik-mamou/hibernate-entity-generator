// default package
// Generated 10 sept. 2021 09:35:34 by Hibernate Tools 6.0.0.Alpha5


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserRoleId generated by hbm2java
 */
@Embeddable
public class UserRoleId  implements java.io.Serializable {


     private Integer idRole;
     private Integer idUser;

    public UserRoleId() {
    }

    public UserRoleId(Integer idRole, Integer idUser) {
       this.idRole = idRole;
       this.idUser = idUser;
    }
   


    @Column(name="id_role")
    public Integer getIdRole() {
        return this.idRole;
    }
    
    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }


    @Column(name="id_user")
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserRoleId) ) return false;
		 UserRoleId castOther = ( UserRoleId ) other; 
         
		 return ( (this.getIdRole()==castOther.getIdRole()) || ( this.getIdRole()!=null && castOther.getIdRole()!=null && this.getIdRole().equals(castOther.getIdRole()) ) )
 && ( (this.getIdUser()==castOther.getIdUser()) || ( this.getIdUser()!=null && castOther.getIdUser()!=null && this.getIdUser().equals(castOther.getIdUser()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdRole() == null ? 0 : this.getIdRole().hashCode() );
         result = 37 * result + ( getIdUser() == null ? 0 : this.getIdUser().hashCode() );
         return result;
   }   


}


