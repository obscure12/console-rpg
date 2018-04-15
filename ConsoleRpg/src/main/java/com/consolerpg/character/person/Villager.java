package com.consolerpg.character.person;

import com.consolerpg.character.Creature;

/**
 * 村人クラス
 * @author obscure12
 *
 */
public class Villager implements Creature{

	/** 名前 */
	private String name;

	/**
	 * コンストラクタ
	 * @param name 名前
	 */
	public Villager(String name) {
		this.name = name;
	}

	/**
	 * 話す
	 */
	@Override
	public void talk() {
		System.out.println("私は" + this.getName() + "です");
	}

	public void help() {
		System.out.println("[" + this.getName() + "] " + "誰か助けて――");
	}

	/**
	 * 名前を取得する
	 * @return 名前
	 */
	@Override
	public String getName() {
		return name;
	}

}
