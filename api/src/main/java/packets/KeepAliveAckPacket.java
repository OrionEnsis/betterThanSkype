package packets;

import utils.Constants;

public class KeepAliveAckPacket extends Packet {
    @Override
    byte[] serialize() {
        return new byte[0];
    }

    @Override
    public byte getOperationCode() {
        return Constants.OPCODE.KEEPALIVEACK;
    }
}
