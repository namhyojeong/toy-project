package com.puppy.witchcraft.game.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppy.witchcraft.common.MainFrame;

public class StoreMenu extends JPanel {

	private MainFrame mf;
	private JPanel storeMenu;
	
	public StoreMenu(MainFrame mf) {
		
		/* 현재 프레임 및 클래스 set */
		this.mf = mf;
		this.storeMenu = this;
		
		/* 라벨에 배경이미지 삽입 */
		JLabel background = new JLabel(new ImageIcon("images/background/bg_store.png"));
		background.setBounds(0, -15, 800, 580);
		
		/* 상점이용하기 버튼 생성 후 상점이용하기 이미지 삽입 */
		JButton storeUseBtn = new JButton(new ImageIcon("images/select/store_use.png"));
		storeUseBtn.setBounds(330, 175, 450, 100);
		storeUseBtn.setContentAreaFilled(false);
		
		/* 나가기 버튼 생성 후 상점 나가기 이미지 삽입 */
		JButton quitBtn = new JButton(new ImageIcon("images/select/map_quit.png"));
		quitBtn.setBounds(330, 275, 450, 100);
		quitBtn.setContentAreaFilled(false);
		
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);
		
		/* 패널에 컴포넌트들 삽입 */
		this.add(storeUseBtn);
		
		this.add(quitBtn);
		
		this.add(background);
		
		/* 프레임에 패널 올리기 */
		mf.add(this);
		
		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
		
		
	}
}
