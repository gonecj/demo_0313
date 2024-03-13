package step3;

public class annotation {

// Copyright (C) emilybache, Inc. All right reserved.
// https://github.com/emilybache/GildedRose-Refactoring-Kata

// History
//--------------------------------------------
// 230910 : 판매기한 조건 추가
// 230101 : 새로운 아이템 추가
// 220104 : 신규 코드 작성

    class Item {
        public String name;
        public int sellIn;
        public int quality;

        public Item(String name, int sellIn, int quality) {
            this.name = name;
            this.sellIn = sellIn;
            this.quality = quality;
        }

        @Override
        public String toString() {
            return this.name + ", " + this.sellIn + ", " + this.quality;
        }
    }

    class GildedRose {
        Item[] items;

        public GildedRose(Item[] items) {
            this.items = items;
        }

        public void updateQuality() {
            for (int i = 0; i < items.length; i++) {

                if (!items[i].name.equals("Aged Brie")
                        && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {

                    if (items[i].quality > 0) {
                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;

                        //콘서트 티켓은 판매 기한이 0에 수렴할 수록 가격이 증가한다.
                        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                            if (items[i].sellIn < 11) {
                                if (items[i].quality < 50) {
                                    items[i].quality = items[i].quality + 1;
                                }
                            }

                            if (items[i].sellIn < 6) {
                                if (items[i].quality < 50) {
                                    items[i].quality = items[i].quality + 1;
                                }
                            }
                        }
                    }
                }

                //TODO 버그 발생 방지
                //Sulfuras 아이템이 아닐 경우에는 판매기한(sellin)을 1 줄인다. by inho.choi
                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    items[i].sellIn = items[i].sellIn - 1;
                }
                //============================================================

                if (items[i].sellIn < 0) {
                    if (!items[i].name.equals("Aged Brie")) {
                        if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                            if (items[i].quality > 0) {
                                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                    items[i].quality = items[i].quality - 1;
                                }
                            }
                        } else {
                            items[i].quality = items[i].quality - items[i].quality;
                        }
                    }
                }
            }
        }
    }
}
