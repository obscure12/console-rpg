package com.consolerpg.character.monster;

/**
 * お化けキノコクラス
 * @author obscure12
 *
 */
public class GhostFungus {

	/** 名前 */
	private String name;

	/** HP */
	private int hp;

	/** レベル */
	private int level;

	/**
	 * コンストラクタ。<br>
	 * レベルに1、HPに100を設定する。
	 * @param name 名前
	 */
	public GhostFungus(String name) {
		this.name = name;
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
	 * 毒ガスを噴射する
	 */
	public void gushPoisonGas() {
		System.out.println(this.getName() + "は毒ガスを噴射した");
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
}
