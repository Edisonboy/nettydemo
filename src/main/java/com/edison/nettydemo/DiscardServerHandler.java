package com.edison.nettydemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

/**
 * @author: zhangzh
 * @Description:
 * @date 2018/3/15 19:18
 */
public class DiscardServerHandler extends ChannelHandlerAdapter {


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    /*@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        try {
            ByteBuf in = (ByteBuf) msg;
            System.out.println(in.toString(CharsetUtil.UTF_8));
        } finally {
            // 丢弃
            ReferenceCountUtil.release(msg);
        }
    }*/
}
