/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tutorial;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-15")
public class QAService {

  public interface Iface {

    public void AskQuestion(List<String> question) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void AskQuestion(List<String> question, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public void AskQuestion(List<String> question) throws org.apache.thrift.TException
    {
      send_AskQuestion(question);
      recv_AskQuestion();
    }

    public void send_AskQuestion(List<String> question) throws org.apache.thrift.TException
    {
      AskQuestion_args args = new AskQuestion_args();
      args.setQuestion(question);
      sendBase("AskQuestion", args);
    }

    public void recv_AskQuestion() throws org.apache.thrift.TException
    {
      AskQuestion_result result = new AskQuestion_result();
      receiveBase(result, "AskQuestion");
      return;
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void AskQuestion(List<String> question, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      AskQuestion_call method_call = new AskQuestion_call(question, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class AskQuestion_call extends org.apache.thrift.async.TAsyncMethodCall {
      private List<String> question;
      public AskQuestion_call(List<String> question, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.question = question;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("AskQuestion", org.apache.thrift.protocol.TMessageType.CALL, 0));
        AskQuestion_args args = new AskQuestion_args();
        args.setQuestion(question);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public void getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        (new Client(prot)).recv_AskQuestion();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("AskQuestion", new AskQuestion());
      return processMap;
    }

    public static class AskQuestion<I extends Iface> extends org.apache.thrift.ProcessFunction<I, AskQuestion_args> {
      public AskQuestion() {
        super("AskQuestion");
      }

      public AskQuestion_args getEmptyArgsInstance() {
        return new AskQuestion_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public AskQuestion_result getResult(I iface, AskQuestion_args args) throws org.apache.thrift.TException {
        AskQuestion_result result = new AskQuestion_result();
        iface.AskQuestion(args.question);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("AskQuestion", new AskQuestion());
      return processMap;
    }

    public static class AskQuestion<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, AskQuestion_args, Void> {
      public AskQuestion() {
        super("AskQuestion");
      }

      public AskQuestion_args getEmptyArgsInstance() {
        return new AskQuestion_args();
      }

      public AsyncMethodCallback<Void> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<Void>() { 
          public void onComplete(Void o) {
            AskQuestion_result result = new AskQuestion_result();
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            AskQuestion_result result = new AskQuestion_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, AskQuestion_args args, org.apache.thrift.async.AsyncMethodCallback<Void> resultHandler) throws TException {
        iface.AskQuestion(args.question,resultHandler);
      }
    }

  }

  public static class AskQuestion_args implements org.apache.thrift.TBase<AskQuestion_args, AskQuestion_args._Fields>, java.io.Serializable, Cloneable, Comparable<AskQuestion_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AskQuestion_args");

    private static final org.apache.thrift.protocol.TField QUESTION_FIELD_DESC = new org.apache.thrift.protocol.TField("question", org.apache.thrift.protocol.TType.LIST, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new AskQuestion_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new AskQuestion_argsTupleSchemeFactory());
    }

    public List<String> question; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      QUESTION((short)1, "question");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // QUESTION
            return QUESTION;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.QUESTION, new org.apache.thrift.meta_data.FieldMetaData("question", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
              new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AskQuestion_args.class, metaDataMap);
    }

    public AskQuestion_args() {
    }

    public AskQuestion_args(
      List<String> question)
    {
      this();
      this.question = question;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public AskQuestion_args(AskQuestion_args other) {
      if (other.isSetQuestion()) {
        List<String> __this__question = new ArrayList<String>(other.question);
        this.question = __this__question;
      }
    }

    public AskQuestion_args deepCopy() {
      return new AskQuestion_args(this);
    }

    @Override
    public void clear() {
      this.question = null;
    }

    public int getQuestionSize() {
      return (this.question == null) ? 0 : this.question.size();
    }

    public java.util.Iterator<String> getQuestionIterator() {
      return (this.question == null) ? null : this.question.iterator();
    }

    public void addToQuestion(String elem) {
      if (this.question == null) {
        this.question = new ArrayList<String>();
      }
      this.question.add(elem);
    }

    public List<String> getQuestion() {
      return this.question;
    }

    public AskQuestion_args setQuestion(List<String> question) {
      this.question = question;
      return this;
    }

    public void unsetQuestion() {
      this.question = null;
    }

    /** Returns true if field question is set (has been assigned a value) and false otherwise */
    public boolean isSetQuestion() {
      return this.question != null;
    }

    public void setQuestionIsSet(boolean value) {
      if (!value) {
        this.question = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case QUESTION:
        if (value == null) {
          unsetQuestion();
        } else {
          setQuestion((List<String>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case QUESTION:
        return getQuestion();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case QUESTION:
        return isSetQuestion();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof AskQuestion_args)
        return this.equals((AskQuestion_args)that);
      return false;
    }

    public boolean equals(AskQuestion_args that) {
      if (that == null)
        return false;

      boolean this_present_question = true && this.isSetQuestion();
      boolean that_present_question = true && that.isSetQuestion();
      if (this_present_question || that_present_question) {
        if (!(this_present_question && that_present_question))
          return false;
        if (!this.question.equals(that.question))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_question = true && (isSetQuestion());
      list.add(present_question);
      if (present_question)
        list.add(question);

      return list.hashCode();
    }

    @Override
    public int compareTo(AskQuestion_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetQuestion()).compareTo(other.isSetQuestion());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetQuestion()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.question, other.question);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("AskQuestion_args(");
      boolean first = true;

      sb.append("question:");
      if (this.question == null) {
        sb.append("null");
      } else {
        sb.append(this.question);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class AskQuestion_argsStandardSchemeFactory implements SchemeFactory {
      public AskQuestion_argsStandardScheme getScheme() {
        return new AskQuestion_argsStandardScheme();
      }
    }

    private static class AskQuestion_argsStandardScheme extends StandardScheme<AskQuestion_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, AskQuestion_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // QUESTION
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                  struct.question = new ArrayList<String>(_list0.size);
                  String _elem1;
                  for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                  {
                    _elem1 = iprot.readString();
                    struct.question.add(_elem1);
                  }
                  iprot.readListEnd();
                }
                struct.setQuestionIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, AskQuestion_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.question != null) {
          oprot.writeFieldBegin(QUESTION_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.question.size()));
            for (String _iter3 : struct.question)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class AskQuestion_argsTupleSchemeFactory implements SchemeFactory {
      public AskQuestion_argsTupleScheme getScheme() {
        return new AskQuestion_argsTupleScheme();
      }
    }

    private static class AskQuestion_argsTupleScheme extends TupleScheme<AskQuestion_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, AskQuestion_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetQuestion()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetQuestion()) {
          {
            oprot.writeI32(struct.question.size());
            for (String _iter4 : struct.question)
            {
              oprot.writeString(_iter4);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, AskQuestion_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
            struct.question = new ArrayList<String>(_list5.size);
            String _elem6;
            for (int _i7 = 0; _i7 < _list5.size; ++_i7)
            {
              _elem6 = iprot.readString();
              struct.question.add(_elem6);
            }
          }
          struct.setQuestionIsSet(true);
        }
      }
    }

  }

  public static class AskQuestion_result implements org.apache.thrift.TBase<AskQuestion_result, AskQuestion_result._Fields>, java.io.Serializable, Cloneable, Comparable<AskQuestion_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AskQuestion_result");


    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new AskQuestion_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new AskQuestion_resultTupleSchemeFactory());
    }


    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
;

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AskQuestion_result.class, metaDataMap);
    }

    public AskQuestion_result() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public AskQuestion_result(AskQuestion_result other) {
    }

    public AskQuestion_result deepCopy() {
      return new AskQuestion_result(this);
    }

    @Override
    public void clear() {
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof AskQuestion_result)
        return this.equals((AskQuestion_result)that);
      return false;
    }

    public boolean equals(AskQuestion_result that) {
      if (that == null)
        return false;

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      return list.hashCode();
    }

    @Override
    public int compareTo(AskQuestion_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("AskQuestion_result(");
      boolean first = true;

      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class AskQuestion_resultStandardSchemeFactory implements SchemeFactory {
      public AskQuestion_resultStandardScheme getScheme() {
        return new AskQuestion_resultStandardScheme();
      }
    }

    private static class AskQuestion_resultStandardScheme extends StandardScheme<AskQuestion_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, AskQuestion_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, AskQuestion_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class AskQuestion_resultTupleSchemeFactory implements SchemeFactory {
      public AskQuestion_resultTupleScheme getScheme() {
        return new AskQuestion_resultTupleScheme();
      }
    }

    private static class AskQuestion_resultTupleScheme extends TupleScheme<AskQuestion_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, AskQuestion_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, AskQuestion_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
      }
    }

  }

}
