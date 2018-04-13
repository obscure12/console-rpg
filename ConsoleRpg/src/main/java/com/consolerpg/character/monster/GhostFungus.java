package com.consolerpg.character.monster;

/**
 * お化けキノコクラス
 * @author obscure12
 *
 */
public class GhostFungus {

	/** 名前 */
	public String name;

	/** HP */
	public int hp;

	/** レベル */
	public int level;

	/**
	 * 話す
	 */
	public void talk() {
		System.out.println("ノコノコノコノコ");
	}

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
	 * 毒ガスを噴射する
	 */
	public void gushPoisonGas() {
		System.out.println(this.name + "は毒ガスを噴射した");
	}
}
