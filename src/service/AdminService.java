package service;

import model.Admin;

public interface AdminService {

    Admin login(Admin admin);

    Admin changePassword(Admin admin);
}
