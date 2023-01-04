/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blooddonationmanagementsystemfinal;

import java.awt.Color;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahbub
 */
public class HomePage extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public HomePage() {
        initComponents();
        con = DBConnection.ConnectionDB();
        updateTable();
    }

    public HomePage(String user) {
        initComponents();
        con = DBConnection.ConnectionDB();
        updateDashboard(user);
        updateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePage = new javax.swing.JPanel();
        HeaderBannerPannel = new javax.swing.JPanel();
        HeaderBannerLabel = new javax.swing.JLabel();
        DashboardPanel = new javax.swing.JPanel();
        ProfilePicPanel = new javax.swing.JPanel();
        profilePic = new javax.swing.JLabel();
        DashboardProfileNamePanel = new javax.swing.JPanel();
        fullName = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        DashboardInfoPanel = new javax.swing.JPanel();
        BloodGroupPanel = new javax.swing.JPanel();
        BloodGroupNamePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        groupNameLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastDonate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateOfBirthLabel = new javax.swing.JLabel();
        DashboardContactPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        signOut = new javax.swing.JButton();
        editProfileBtn = new javax.swing.JButton();
        BloodLogoLabel = new javax.swing.JLabel();
        mainTablePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchByID = new javax.swing.JTextField();
        searchByNameBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        selectedBloodGroup = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setType(java.awt.Window.Type.UTILITY);

        HomePage.setMaximumSize(new java.awt.Dimension(1387, 646));

        HeaderBannerPannel.setBackground(new java.awt.Color(255, 51, 51));
        HeaderBannerPannel.setMaximumSize(new java.awt.Dimension(1381, 126));

        HeaderBannerLabel.setFont(new java.awt.Font("Fira Code", 1, 45)); // NOI18N
        HeaderBannerLabel.setForeground(new java.awt.Color(255, 255, 255));
        HeaderBannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderBannerLabel.setText("Welcome to Blood Donation Management System");

        javax.swing.GroupLayout HeaderBannerPannelLayout = new javax.swing.GroupLayout(HeaderBannerPannel);
        HeaderBannerPannel.setLayout(HeaderBannerPannelLayout);
        HeaderBannerPannelLayout.setHorizontalGroup(
            HeaderBannerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderBannerPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderBannerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE))
        );
        HeaderBannerPannelLayout.setVerticalGroup(
            HeaderBannerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderBannerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        DashboardPanel.setMaximumSize(new java.awt.Dimension(399, 609));

        ProfilePicPanel.setMaximumSize(new java.awt.Dimension(286, 126));

        profilePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonationmanagementsystemfinal/hackerrank_c++.png"))); // NOI18N
        profilePic.setText("Profile_pic");

        javax.swing.GroupLayout ProfilePicPanelLayout = new javax.swing.GroupLayout(ProfilePicPanel);
        ProfilePicPanel.setLayout(ProfilePicPanelLayout);
        ProfilePicPanelLayout.setHorizontalGroup(
            ProfilePicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ProfilePicPanelLayout.setVerticalGroup(
            ProfilePicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DashboardProfileNamePanel.setMaximumSize(new java.awt.Dimension(252, 89));

        fullName.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        fullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullName.setText("Rakiba Akter Rimi");

        userName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(102, 102, 102));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("RakibaAkter");
        userName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout DashboardProfileNamePanelLayout = new javax.swing.GroupLayout(DashboardProfileNamePanel);
        DashboardProfileNamePanel.setLayout(DashboardProfileNamePanelLayout);
        DashboardProfileNamePanelLayout.setHorizontalGroup(
            DashboardProfileNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardProfileNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DashboardProfileNamePanelLayout.setVerticalGroup(
            DashboardProfileNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardProfileNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        DashboardInfoPanel.setMaximumSize(new java.awt.Dimension(0, 358));

        javax.swing.GroupLayout DashboardInfoPanelLayout = new javax.swing.GroupLayout(DashboardInfoPanel);
        DashboardInfoPanel.setLayout(DashboardInfoPanelLayout);
        DashboardInfoPanelLayout.setHorizontalGroup(
            DashboardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DashboardInfoPanelLayout.setVerticalGroup(
            DashboardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        BloodGroupPanel.setMaximumSize(new java.awt.Dimension(327, 103));

        BloodGroupNamePanel.setMaximumSize(new java.awt.Dimension(242, 64));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Blood Group : ");

        groupNameLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        groupNameLabel.setText("B +ve");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Last Donate : ");

        lastDonate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lastDonate.setText("100 days ago");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth : ");

        dateOfBirthLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        dateOfBirthLabel.setText("jLabel8");

        javax.swing.GroupLayout BloodGroupNamePanelLayout = new javax.swing.GroupLayout(BloodGroupNamePanel);
        BloodGroupNamePanel.setLayout(BloodGroupNamePanelLayout);
        BloodGroupNamePanelLayout.setHorizontalGroup(
            BloodGroupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodGroupNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BloodGroupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BloodGroupNamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastDonate, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(BloodGroupNamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(groupNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BloodGroupNamePanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfBirthLabel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        BloodGroupNamePanelLayout.setVerticalGroup(
            BloodGroupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodGroupNamePanelLayout.createSequentialGroup()
                .addGroup(BloodGroupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(groupNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BloodGroupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dateOfBirthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BloodGroupNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastDonate))
                .addContainerGap())
        );

        javax.swing.GroupLayout BloodGroupPanelLayout = new javax.swing.GroupLayout(BloodGroupPanel);
        BloodGroupPanel.setLayout(BloodGroupPanelLayout);
        BloodGroupPanelLayout.setHorizontalGroup(
            BloodGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodGroupPanelLayout.createSequentialGroup()
                .addComponent(BloodGroupNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );
        BloodGroupPanelLayout.setVerticalGroup(
            BloodGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BloodGroupPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BloodGroupNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        DashboardContactPanel.setMaximumSize(new java.awt.Dimension(385, 52));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Contact  : ");

        phoneNumberLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        phoneNumberLabel.setText("01877763406");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Address : ");

        addressLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addressLabel.setText("MoghBazar, Dhaka 1217, Bangladesh");

        javax.swing.GroupLayout DashboardContactPanelLayout = new javax.swing.GroupLayout(DashboardContactPanel);
        DashboardContactPanel.setLayout(DashboardContactPanelLayout);
        DashboardContactPanelLayout.setHorizontalGroup(
            DashboardContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardContactPanelLayout.createSequentialGroup()
                .addGroup(DashboardContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DashboardContactPanelLayout.setVerticalGroup(
            DashboardContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardContactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setMaximumSize(new java.awt.Dimension(384, 40));

        signOut.setBackground(new java.awt.Color(204, 204, 204));
        signOut.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        signOut.setText("Sign out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        editProfileBtn.setBackground(new java.awt.Color(204, 204, 204));
        editProfileBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        editProfileBtn.setText("Edit Profile");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(signOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(editProfileBtn)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signOut)
                    .addComponent(editProfileBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BloodLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BloodLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blooddonationmanagementsystemfinal/main_icon.png"))); // NOI18N

        javax.swing.GroupLayout DashboardPanelLayout = new javax.swing.GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DashboardProfileNamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashboardContactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DashboardPanelLayout.createSequentialGroup()
                        .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashboardPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BloodLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BloodGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DashboardInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ProfilePicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        DashboardPanelLayout.setVerticalGroup(
            DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ProfilePicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DashboardProfileNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DashboardInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DashboardPanelLayout.createSequentialGroup()
                        .addGroup(DashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BloodLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodGroupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(DashboardContactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTablePanel.setMaximumSize(new java.awt.Dimension(987, 501));

        jPanel2.setMaximumSize(new java.awt.Dimension(829, 85));

        jPanel3.setMaximumSize(new java.awt.Dimension(495, 53));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Search By ID : ");

        searchByID.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        searchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIDActionPerformed(evt);
            }
        });
        searchByID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchByIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchByIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchByIDKeyTyped(evt);
            }
        });

        searchByNameBtn.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        searchByNameBtn.setText("Search");
        searchByNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNameBtnActionPerformed(evt);
            }
        });

        jPanel4.setMaximumSize(new java.awt.Dimension(328, 73));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Search By Blood Group : ");

        selectedBloodGroup.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        selectedBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "A +ve", "A -ve", "B +ve", "B -ve", "O +ve", "O -ve", "AB +ve", "AB -ve" }));
        selectedBloodGroup.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                selectedBloodGroupPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                selectedBloodGroupPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectedBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(selectedBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchByNameBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchByID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByNameBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Name", "Blood Group", "Gender", "Contact No", "Last Donation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        mainTable.setFillsViewportHeight(true);
        mainTable.setGridColor(new java.awt.Color(153, 153, 153));
        mainTable.setMaximumSize(new java.awt.Dimension(90, 50000));
        mainTable.setSelectionBackground(new java.awt.Color(0, 204, 51));
        mainTable.setSurrendersFocusOnKeystroke(true);
        mainTable.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(mainTable);

        javax.swing.GroupLayout mainTablePanelLayout = new javax.swing.GroupLayout(mainTablePanel);
        mainTablePanel.setLayout(mainTablePanelLayout);
        mainTablePanelLayout.setHorizontalGroup(
            mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainTablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainTablePanelLayout.setVerticalGroup(
            mainTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(mainTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HeaderBannerPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addComponent(HeaderBannerPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomePage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Confirm Signout ?", "File",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (res == 0) {
            new loginForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_signOutActionPerformed

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_editProfileBtnActionPerformed

    private void searchByNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNameBtnActionPerformed
        // TODO add your handling code here:
        String sql = "select first_name,last_name,blood_group,gender,contact,ldod from Users_info where user_id like ? ORDER BY ldod ASC";
        int serial = 0;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + searchByID.getText() + "%");
            rs = pst.executeQuery();

            DefaultTableModel dtm = (DefaultTableModel) mainTable.getModel();
            dtm.setRowCount(0);
            
            String lastDayOfDonation = "Never!";
            Date today = java.sql.Date.valueOf(java.time.LocalDate.now());
            while (rs.next()) {
                String name = rs.getString("first_name") + " " + rs.getString("last_name");
                String bloodGroup = rs.getString("blood_group");
                String gender = rs.getString("gender");
                String contact = rs.getString("contact");
                String ldod = rs.getString("ldod");
                String ser = Integer.toString(++serial);
                
                if(!"1950-01-01".equals(ldod)) {
                    Date date1 = java.sql.Date.valueOf(ldod);
                    int days = (int) (((today.getTime() - date1.getTime()) / 3600000) / 24);
                    lastDayOfDonation = Integer.toString(days) + " Days age.";
                    mainTable.setBackground(days >= 120 ? Color.GREEN : Color.RED);
                }else{
                    mainTable.setBackground(Color.GREEN);
                }
                String tbData[] = {ser, name, bloodGroup, gender, contact, lastDayOfDonation};
                DefaultTableModel tblModel = (DefaultTableModel) mainTable.getModel();
                
                
                tblModel.addRow(tbData);
                
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_searchByNameBtnActionPerformed

    private void searchByIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByIDKeyReleased

    private void searchByIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByIDKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchByIDKeyPressed

    private void searchByIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchByIDKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_searchByIDKeyTyped

    private void selectedBloodGroupPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_selectedBloodGroupPopupMenuCanceled
        // TODO add your handling code here:


    }//GEN-LAST:event_selectedBloodGroupPopupMenuCanceled

    private void selectedBloodGroupPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_selectedBloodGroupPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String blood_G = selectedBloodGroup.getSelectedItem().toString();
        String sql = "select first_name,last_name,blood_group,gender,contact,ldod from Users_info where blood_group LIKE ? ORDER BY ldod ASC";
        int serial = 0;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, blood_G + "%");
            rs = pst.executeQuery();

            DefaultTableModel dtm = (DefaultTableModel) mainTable.getModel();
            dtm.setRowCount(0);
            String lastDayOfDonation = "Never!";
            Date today = java.sql.Date.valueOf(java.time.LocalDate.now());
            
            while (rs.next()) {
                String name = rs.getString("first_name") + " " + rs.getString("last_name");
                String bloodGroup = rs.getString("blood_group");
                String gender = rs.getString("gender");
                String contact = rs.getString("contact");
                String ldod = rs.getString("ldod");
                String ser = Integer.toString(++serial);

                
                
                
                if(!"1950-01-01".equals(ldod)){
                
                    Date date1 = java.sql.Date.valueOf(ldod);
                    int days = (int) (((today.getTime() - date1.getTime()) / 3600000) / 24);
                    lastDayOfDonation = Integer.toString(days) + " Days age.";
                }
                
                String tbData[] = {ser, name, bloodGroup, gender, contact, lastDayOfDonation};
                DefaultTableModel tblModel = (DefaultTableModel) mainTable.getModel();

                tblModel.addRow(tbData);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_selectedBloodGroupPopupMenuWillBecomeInvisible

    private void searchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByIDActionPerformed

    private void updateDashboard(String user) {
        String sql = "select * from Users_info where user_id like ? ";

        System.out.println(user);
        try {

            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            rs = pst.executeQuery();

            if (rs.next()) {
                String name = rs.getString("first_name") + " " + rs.getString("last_name");
                String userId = rs.getString("user_id");
                String bloodGroup = rs.getString("blood_group");
                String date = rs.getString("dob");

                String contact = rs.getString("contact");
                String ldod = rs.getString("ldod");
                String address = rs.getString("area") + " , " + rs.getString("district") + " , " + rs.getString("country");

                
                if("1950-01-01".equals(ldod)){
                    lastDonate.setText(" Never");
                }else {
                    Date date1 = java.sql.Date.valueOf(ldod);
                    Date today = java.sql.Date.valueOf(java.time.LocalDate.now());

                    long days = ((today.getTime() - date1.getTime()) / 3600000) / 24;
                    lastDonate.setText(days + " days age.");
                } 

                fullName.setText(name);
                dateOfBirthLabel.setText(date);
                userName.setText(userId);
                groupNameLabel.setText(bloodGroup);

                phoneNumberLabel.setText(contact);
                addressLabel.setText(address);

                fullName.paintImmediately(fullName.getVisibleRect()); // to update all the values

            } else {
                JOptionPane.showMessageDialog(null, "Error occurs");
            }


        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    /**
     * UpdateTable calls Every time when you search or open this page
     *
     * @param
     */
    private void updateTable() {
        String sql = "select first_name,last_name,blood_group,gender,contact,ldod from Users_info ORDER BY ldod ASC";
        int serial = 0;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            mainTable.setSelectionBackground(Color.lightGray);
            mainTable.setSelectionForeground(Color.BLACK);
            
            Date date1;
            String lastDayOfDonation = "Never ! ";
            Date today = java.sql.Date.valueOf(java.time.LocalDate.now());
            while (rs.next()) {
                String name = rs.getString("first_name") + " " + rs.getString("last_name");
                String bloodGroup = rs.getString("blood_group");
                String gender = rs.getString("gender");
                String contact = rs.getString("contact");
                String ldod = rs.getString("ldod");
                String ser = Integer.toString(++serial);
                

                
                if(!"1950-01-01".equals(ldod)){
                    date1 = java.sql.Date.valueOf(ldod);
                    int days = (int) (((today.getTime() - date1.getTime()) / 3600000) / 24);
                    lastDayOfDonation = Integer.toString(days) + " Days ago.";
                }

                String tbData[] = {ser, name, bloodGroup, gender, contact, lastDayOfDonation};
                DefaultTableModel tblModel = (DefaultTableModel) mainTable.getModel();

                tblModel.addRow(tbData);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BloodGroupNamePanel;
    private javax.swing.JPanel BloodGroupPanel;
    private javax.swing.JLabel BloodLogoLabel;
    private javax.swing.JPanel DashboardContactPanel;
    private javax.swing.JPanel DashboardInfoPanel;
    private javax.swing.JPanel DashboardPanel;
    private javax.swing.JPanel DashboardProfileNamePanel;
    private javax.swing.JLabel HeaderBannerLabel;
    private javax.swing.JPanel HeaderBannerPannel;
    private javax.swing.JPanel HomePage;
    private javax.swing.JPanel ProfilePicPanel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel dateOfBirthLabel;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel groupNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastDonate;
    private javax.swing.JTable mainTable;
    private javax.swing.JPanel mainTablePanel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel profilePic;
    private javax.swing.JTextField searchByID;
    private javax.swing.JButton searchByNameBtn;
    private javax.swing.JComboBox<String> selectedBloodGroup;
    private javax.swing.JButton signOut;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
