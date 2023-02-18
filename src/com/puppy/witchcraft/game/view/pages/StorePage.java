package com.puppy.witchcraft.game.view.pages;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppy.witchcraft.common.MainFrame;

public class StorePage extends JPanel {
	
	private MainFrame mf;
	private JPanel storePage;
	
	public StorePage(MainFrame mf) {
		
		/* 현재 프레임 및 클래스 set */
		this.mf = mf;
		this.storePage = this;
		
		/* 라벨에 배경이미지 삽입 */
		JLabel background = new JLabel(new ImageIcon("images/background/bg_store.png"));
		background.setBounds(0, -15, 800, 580);
		
		/* 라벨에 상점재료리스트 이미지 삽입 */
		JLabel storePurchase = new JLabel(new ImageIcon("images/ui/storeitem_list.png"));
		storePurchase.setBounds(20, 30, 340, 400);
		
		/* 라벨에 재료인벤토리 이미지 삽입 */
		JLabel storeSell = new JLabel(new ImageIcon("images/ui/inventory_item.png"));
		storeSell.setBounds(425, 30, 340, 400);
		
		/* 라벨에 골드 이미지 삽입 */
		JLabel gold = new JLabel(new ImageIcon("images/ui/icon_gold.png"));
		gold.setBounds(635, 450, 25, 25);
		
		/* 라벨에 골드 텍스트필드 생성 */
		/* 텍스트 정렬 구글 찾아보기 */
		/* 재료 창 구글 찾아보기 */
		JLabel textId = new JLabel("     0G");
		textId.setBounds(660, 450, 110, 25);
		textId.setForeground(Color.WHITE);
		
		/* 라벨에 나가기 이미지 삽입 */
		JLabel quit = new JLabel(new ImageIcon("images/ui/button_quit.png"));
		quit.setBounds(0, 460, 170, 70);
		
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 800, 580);
		
		/* 패널에 컴포넌트들 삽입 */
		this.add(storePurchase);
		this.add(storeSell);
		this.add(gold);
		this.add(quit);
		this.add(textId);
		this.add(background);
		
		/* 프레임에 패널 올리기 */
		mf.add(this);
		
		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);

	}

}
