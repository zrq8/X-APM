package github.tornaco.xposedmoduletest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "LOCK_KILL_PACKAGE".
 */
@Entity
public class LockKillPackage {

    @Id
    private Integer id;
    private String pkgName;
    private String appName;
    private Boolean kill;

    @Transient
    private boolean isSystemApp;

    @Generated(hash = 1702703589)
    public LockKillPackage() {
    }

    public LockKillPackage(Integer id) {
        this.id = id;
    }

    @Generated(hash = 1760576630)
    public LockKillPackage(Integer id, String pkgName, String appName, Boolean kill) {
        this.id = id;
        this.pkgName = pkgName;
        this.appName = appName;
        this.kill = kill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Boolean getKill() {
        return kill;
    }

    public void setKill(Boolean kill) {
        this.kill = kill;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public String toString() {
        return "LockKillPackage{" +
                "id=" + id +
                ", pkgName='" + pkgName + '\'' +
                ", appName='" + appName + '\'' +
                ", kill=" + kill +
                '}';
    }

    public boolean isSystemApp() {
        return isSystemApp;
    }

    public void setSystemApp(boolean systemApp) {
        isSystemApp = systemApp;
    }

    // KEEP METHODS END

}
