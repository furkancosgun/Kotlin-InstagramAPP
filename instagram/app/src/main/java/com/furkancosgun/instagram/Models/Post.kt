package com.furkancosgun.instagram.Models

data class Post(
    val imgProfile: String,
    val uname: String,
    val contentImg: String,
    val likeSize: String,
    val contentTxt: String
)

class Posts {
    companion object {
        val posts = mutableListOf<Post>(
            Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.JREvq-wAYYqc9dnnPVrZtAHaE8%26pid%3DApi&f=1&ipt=5dfb44332162a686c40c07c6d670ba555c2dbf8322556035674a3f58eeeb3056&ipo=images",
                "100M",
                "Tesla Model S"
            ),
            Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.lVOC8ZzqOr_8u1SwCIGyiAHaFj%26pid%3DApi&f=1&ipt=3e69fa9d5bb6a574a43ce9b49e60fc64dd04261000cd908c21c2c19cd05c76ae&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.v7ulBCHiVfQOrJdk5zbuOgHaEj%26pid%3DApi&f=1&ipt=3af3fc2988ccbc4f0c6054a6cdc59eb05f2ed539fccdb6e858d03a6bc5e58544&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.olB_THpfZZTpIhzp9SsJggHaE8%26pid%3DApi&f=1&ipt=411d8550d0dd5f049d453dfbdb78c43ae93e9bc47201a8bffd7a546187bfb838&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.86H2MbC3FT7Yo-eW7YHzUQHaHa%26pid%3DApi&f=1&ipt=7a9b4c07e83a1bcb64fd699eea3badc95e6f0e1fe40ded68c8bc83f8881d528a&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.JREvq-wAYYqc9dnnPVrZtAHaE8%26pid%3DApi&f=1&ipt=5dfb44332162a686c40c07c6d670ba555c2dbf8322556035674a3f58eeeb3056&ipo=images",
                "100M",
                "Tesla Model S"
            ),
            Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.lVOC8ZzqOr_8u1SwCIGyiAHaFj%26pid%3DApi&f=1&ipt=3e69fa9d5bb6a574a43ce9b49e60fc64dd04261000cd908c21c2c19cd05c76ae&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.v7ulBCHiVfQOrJdk5zbuOgHaEj%26pid%3DApi&f=1&ipt=3af3fc2988ccbc4f0c6054a6cdc59eb05f2ed539fccdb6e858d03a6bc5e58544&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.olB_THpfZZTpIhzp9SsJggHaE8%26pid%3DApi&f=1&ipt=411d8550d0dd5f049d453dfbdb78c43ae93e9bc47201a8bffd7a546187bfb838&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.86H2MbC3FT7Yo-eW7YHzUQHaHa%26pid%3DApi&f=1&ipt=7a9b4c07e83a1bcb64fd699eea3badc95e6f0e1fe40ded68c8bc83f8881d528a&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.JREvq-wAYYqc9dnnPVrZtAHaE8%26pid%3DApi&f=1&ipt=5dfb44332162a686c40c07c6d670ba555c2dbf8322556035674a3f58eeeb3056&ipo=images",
                "100M",
                "Tesla Model S"
            ),
            Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.lVOC8ZzqOr_8u1SwCIGyiAHaFj%26pid%3DApi&f=1&ipt=3e69fa9d5bb6a574a43ce9b49e60fc64dd04261000cd908c21c2c19cd05c76ae&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.v7ulBCHiVfQOrJdk5zbuOgHaEj%26pid%3DApi&f=1&ipt=3af3fc2988ccbc4f0c6054a6cdc59eb05f2ed539fccdb6e858d03a6bc5e58544&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.olB_THpfZZTpIhzp9SsJggHaE8%26pid%3DApi&f=1&ipt=411d8550d0dd5f049d453dfbdb78c43ae93e9bc47201a8bffd7a546187bfb838&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.86H2MbC3FT7Yo-eW7YHzUQHaHa%26pid%3DApi&f=1&ipt=7a9b4c07e83a1bcb64fd699eea3badc95e6f0e1fe40ded68c8bc83f8881d528a&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse4.mm.bing.net%2Fth%3Fid%3DOIP.JREvq-wAYYqc9dnnPVrZtAHaE8%26pid%3DApi&f=1&ipt=5dfb44332162a686c40c07c6d670ba555c2dbf8322556035674a3f58eeeb3056&ipo=images",
                "100M",
                "Tesla Model S"
            ),
            Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.lVOC8ZzqOr_8u1SwCIGyiAHaFj%26pid%3DApi&f=1&ipt=3e69fa9d5bb6a574a43ce9b49e60fc64dd04261000cd908c21c2c19cd05c76ae&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.v7ulBCHiVfQOrJdk5zbuOgHaEj%26pid%3DApi&f=1&ipt=3af3fc2988ccbc4f0c6054a6cdc59eb05f2ed539fccdb6e858d03a6bc5e58544&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.olB_THpfZZTpIhzp9SsJggHaE8%26pid%3DApi&f=1&ipt=411d8550d0dd5f049d453dfbdb78c43ae93e9bc47201a8bffd7a546187bfb838&ipo=images",
                "100M",
                "Tesla Model S"
            ), Post(
                "https://i.insider.com/556e35f56bb3f7192014f8a2",
                "Elon_Musk",
                "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse1.mm.bing.net%2Fth%3Fid%3DOIP.86H2MbC3FT7Yo-eW7YHzUQHaHa%26pid%3DApi&f=1&ipt=7a9b4c07e83a1bcb64fd699eea3badc95e6f0e1fe40ded68c8bc83f8881d528a&ipo=images",
                "100M",
                "Tesla Model S"
            )
        )
    }
}