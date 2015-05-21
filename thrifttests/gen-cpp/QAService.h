/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef QAService_H
#define QAService_H

#include <thrift/TDispatchProcessor.h>
#include "qaservice_types.h"



class QAServiceIf {
 public:
  virtual ~QAServiceIf() {}
  virtual void AskQuestion(const std::vector<std::string> & question) = 0;
};

class QAServiceIfFactory {
 public:
  typedef QAServiceIf Handler;

  virtual ~QAServiceIfFactory() {}

  virtual QAServiceIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler(QAServiceIf* /* handler */) = 0;
};

class QAServiceIfSingletonFactory : virtual public QAServiceIfFactory {
 public:
  QAServiceIfSingletonFactory(const boost::shared_ptr<QAServiceIf>& iface) : iface_(iface) {}
  virtual ~QAServiceIfSingletonFactory() {}

  virtual QAServiceIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler(QAServiceIf* /* handler */) {}

 protected:
  boost::shared_ptr<QAServiceIf> iface_;
};

class QAServiceNull : virtual public QAServiceIf {
 public:
  virtual ~QAServiceNull() {}
  void AskQuestion(const std::vector<std::string> & /* question */) {
    return;
  }
};

typedef struct _QAService_AskQuestion_args__isset {
  _QAService_AskQuestion_args__isset() : question(false) {}
  bool question :1;
} _QAService_AskQuestion_args__isset;

class QAService_AskQuestion_args {
 public:

  static const char* ascii_fingerprint; // = "ACE4F644F0FDD289DDC4EE5B83BC13C0";
  static const uint8_t binary_fingerprint[16]; // = {0xAC,0xE4,0xF6,0x44,0xF0,0xFD,0xD2,0x89,0xDD,0xC4,0xEE,0x5B,0x83,0xBC,0x13,0xC0};

  QAService_AskQuestion_args(const QAService_AskQuestion_args&);
  QAService_AskQuestion_args& operator=(const QAService_AskQuestion_args&);
  QAService_AskQuestion_args() {
  }

  virtual ~QAService_AskQuestion_args() throw();
  std::vector<std::string>  question;

  _QAService_AskQuestion_args__isset __isset;

  void __set_question(const std::vector<std::string> & val);

  bool operator == (const QAService_AskQuestion_args & rhs) const
  {
    if (!(question == rhs.question))
      return false;
    return true;
  }
  bool operator != (const QAService_AskQuestion_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const QAService_AskQuestion_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  friend std::ostream& operator<<(std::ostream& out, const QAService_AskQuestion_args& obj);
};


class QAService_AskQuestion_pargs {
 public:

  static const char* ascii_fingerprint; // = "ACE4F644F0FDD289DDC4EE5B83BC13C0";
  static const uint8_t binary_fingerprint[16]; // = {0xAC,0xE4,0xF6,0x44,0xF0,0xFD,0xD2,0x89,0xDD,0xC4,0xEE,0x5B,0x83,0xBC,0x13,0xC0};


  virtual ~QAService_AskQuestion_pargs() throw();
  const std::vector<std::string> * question;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  friend std::ostream& operator<<(std::ostream& out, const QAService_AskQuestion_pargs& obj);
};


class QAService_AskQuestion_result {
 public:

  static const char* ascii_fingerprint; // = "99914B932BD37A50B983C5E7C90AE93B";
  static const uint8_t binary_fingerprint[16]; // = {0x99,0x91,0x4B,0x93,0x2B,0xD3,0x7A,0x50,0xB9,0x83,0xC5,0xE7,0xC9,0x0A,0xE9,0x3B};

  QAService_AskQuestion_result(const QAService_AskQuestion_result&);
  QAService_AskQuestion_result& operator=(const QAService_AskQuestion_result&);
  QAService_AskQuestion_result() {
  }

  virtual ~QAService_AskQuestion_result() throw();

  bool operator == (const QAService_AskQuestion_result & /* rhs */) const
  {
    return true;
  }
  bool operator != (const QAService_AskQuestion_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const QAService_AskQuestion_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  friend std::ostream& operator<<(std::ostream& out, const QAService_AskQuestion_result& obj);
};


class QAService_AskQuestion_presult {
 public:

  static const char* ascii_fingerprint; // = "99914B932BD37A50B983C5E7C90AE93B";
  static const uint8_t binary_fingerprint[16]; // = {0x99,0x91,0x4B,0x93,0x2B,0xD3,0x7A,0x50,0xB9,0x83,0xC5,0xE7,0xC9,0x0A,0xE9,0x3B};


  virtual ~QAService_AskQuestion_presult() throw();

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

  friend std::ostream& operator<<(std::ostream& out, const QAService_AskQuestion_presult& obj);
};

class QAServiceClient : virtual public QAServiceIf {
 public:
  QAServiceClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  QAServiceClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void AskQuestion(const std::vector<std::string> & question);
  void send_AskQuestion(const std::vector<std::string> & question);
  void recv_AskQuestion();
 protected:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
};

class QAServiceProcessor : public ::apache::thrift::TDispatchProcessor {
 protected:
  boost::shared_ptr<QAServiceIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (QAServiceProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_AskQuestion(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  QAServiceProcessor(boost::shared_ptr<QAServiceIf> iface) :
    iface_(iface) {
    processMap_["AskQuestion"] = &QAServiceProcessor::process_AskQuestion;
  }

  virtual ~QAServiceProcessor() {}
};

class QAServiceProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  QAServiceProcessorFactory(const ::boost::shared_ptr< QAServiceIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::boost::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::boost::shared_ptr< QAServiceIfFactory > handlerFactory_;
};

class QAServiceMultiface : virtual public QAServiceIf {
 public:
  QAServiceMultiface(std::vector<boost::shared_ptr<QAServiceIf> >& ifaces) : ifaces_(ifaces) {
  }
  virtual ~QAServiceMultiface() {}
 protected:
  std::vector<boost::shared_ptr<QAServiceIf> > ifaces_;
  QAServiceMultiface() {}
  void add(boost::shared_ptr<QAServiceIf> iface) {
    ifaces_.push_back(iface);
  }
 public:
  void AskQuestion(const std::vector<std::string> & question) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->AskQuestion(question);
    }
    ifaces_[i]->AskQuestion(question);
  }

};



#endif
