package com.consolerpg.character.hero;

/**
 * 勇者クラス
 * @author obscure12
 *
 */
public class Hero {

	/** 名前 */
	private String name;

	/** HP */
	private int hp;

	/** レベル */
	private int level;

	/** 性別 */
	private String gender;

	/**
	 * コンストラクタ<br>
	 * レベルに1、HPに100を設定する
	 * @param name 名前
	 * @param gender 性別
	 */
	public Hero(String name, String gender) {
		this.name = name;
		this.gender = gender;
		this.level = 1;
		this.hp = 100;
	}

	/**
	 * 攻撃する
	 */
	public void attack() {
		System.out.println(this.getName() + "は攻撃した");
	}

	/**
	 * 逃げる
	 */
	public void run() {
		System.out.println(this.getName() + "は逃げた");
	}

	/**
	 * 座る
	 */
	public void sit() {
		System.out.println(this.getName() + "は座った");
	}

	/**
	 * 眠る
	 */
	public void sleep() {
		System.out.println(this.getName() + "は眠った");
	}

	/**
	 * 名前を取得する
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * HPを取得する
	 * @return HP
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * HPを設定する
	 * @param hp HP
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * レベルを取得する
	 * @return レベル
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * レベルを設定する
	 * @param level レベル
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * 性別を取得する
	 * @return 性別
	 */
	public String getGender() {
		return gender;
	}

}
