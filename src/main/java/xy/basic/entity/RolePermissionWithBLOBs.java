package xy.basic.entity;

public class RolePermissionWithBLOBs extends RolePermission {
    private byte[] permission;

    private byte[] role;

    public byte[] getPermission() {
        return permission;
    }

    public void setPermission(byte[] permission) {
        this.permission = permission;
    }

    public byte[] getRole() {
        return role;
    }

    public void setRole(byte[] role) {
        this.role = role;
    }
}