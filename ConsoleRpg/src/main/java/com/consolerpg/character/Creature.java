package com.consolerpg.character;

/**
 * 生き物を表すインタフェース
 * @author obscure12
 *
 */
public interface Creature {

	/**
	 * 話す
	 */
	void talk();

	/**
	 * 名前を取得する
	 * @return 名前
	 */
	String getName();
}
