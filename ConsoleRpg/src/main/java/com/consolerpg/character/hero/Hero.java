package com.consolerpg.character.hero;

/**
 * 勇者クラス
 * @author obscure12
 *
 */
public class Hero {

	/** 名前 */
	public String name;

	/** HP */
	public int hp;

	/** レベル */
	public int level;

	/** 性別 */
	public String gender;

	/**
	 * 攻撃する
	 */
	public void attack() {
		System.out.println(this.name + "は攻撃した");
	}

	/**
	 * 逃げる
	 */
	public void run() {
		System.out.println(this.name + "は逃げた");
	}

	/**
	 * 座る
	 */
	public void sit() {
		System.out.println(this.name + "は座った");
	}

	/**
	 * 眠る
	 */
	public void sleep() {
		System.out.println(this.name + "は眠った");
	}
}
