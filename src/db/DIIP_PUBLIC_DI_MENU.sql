INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('para_manager', 'el-icon-setting', '参数管理', 'Parameter', null, null, 1);
INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('job_manager', 'el-icon-share', '作业管理', 'Job', null, null, 2);
INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('sul_monitor', 'el-icon-view', '调度监控', 'Monitor', null, null, 3);
INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('user_manager', 'el-icon-tickets', '用户管理', 'Users', '/users', 'para_manager', 1);
INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('auth_manager', 'el-icon-menu', '权限管理', 'Authorization', '/authorization', 'para_manager', 2);
INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('project_manager', 'el-icon-tickets', '项目管理', 'Project', '/project', 'job_manager', 1);
INSERT INTO PUBLIC.DI_MENU (ID, ICON, NAME, NAME_EN, ROUTER, PARENT_ID, SEQ) VALUES ('flow_manager', 'el-icon-news', '流程管理', 'Flow', '/flow', 'job_manager', 2);