package com.puppy.witchcraft.game.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppy.witchcraft.common.CommonConstants;
import static com.puppy.witchcraft.common.CommonConstants.changePanel;
import static com.puppy.witchcraft.common.CommonConstants.setButtonColor;

import com.puppy.witchcraft.common.MainFrame;
import com.puppy.witchcraft.game.view.pages.LoginPage;
import com.puppy.witchcraft.game.view.pages.SigninPage;

public class GameMenu extends JPanel {

	/* 전역변수에 컬러파레트 지정 */
	private Color MAINCOLOR = CommonConstants.MAINCOLOR;
	private Color NAVYCOLOR = CommonConstants.NAVYCOLOR;
	private Color GRAYCOLOR = CommonConstants.GRAYCOLOR;

	private MainFrame mf;
	private JPanel gameMenu;

	public GameMenu(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.gameMenu = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/bg_start.png"));
		background.setBounds(0, -15, 800, 580);

		/* 라벨에 타이틀로고 삽입 */
		JLabel logo = new JLabel(new ImageIcon("images/ui/title_logo"));
		logo.setBounds(180, 90, 440, 160);

		/* 로그인 버튼 생성 */
		JButton loginBtn = new JButton("Login");									
		loginBtn.setBounds(305, 300, 190, 55);
		setButtonColor(loginBtn, MAINCOLOR, Color.WHITE);

		/* 로그인 버튼 클릭 시 로그인화면 패널로 변경*/
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, gameMenu, new LoginPage(mf)); //test
				System.out.println("로그인 페이지로 이동");
			}
		});

		/* 회원가입 버튼 생성 */
		JButton signinBtn = new JButton("Sign in");
		signinBtn.setBounds(305, 365, 190, 55);
		setButtonColor(signinBtn, NAVYCOLOR, Color.WHITE);

		/* 회원가입 버튼 클릭 시 회원가입화면 패널로 변경*/
		signinBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, gameMenu, new SigninPage(mf));
			}
		});

		/* 나가기 버튼 생성 */
		JButton quitBtn = new JButton("Quit");
		quitBtn.setBounds(305, 430, 190, 55);
		setButtonColor(quitBtn, GRAYCOLOR, Color.WHITE);

		/* 나가기 버튼 클릭 시 시스템 종료*/
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		});

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);

		/* 패널에 컴포넌트들 삽입 */
		this.add(logo);
		
		this.add(signinBtn);
		this.add(loginBtn);
		this.add(quitBtn);
		
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}


}
