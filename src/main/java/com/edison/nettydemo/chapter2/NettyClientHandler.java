package com.edison.nettydemo.chapter2;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author: zhangzh
 * @Description:
 * @date 2018/3/21 17:15
 */
public class NettyClientHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("客户端接受的消息: " + msg);
    }

    //
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("正在连接... ");
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("连接关闭! ");
        super.channelInactive(ctx);
    }
}
