(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-6cefd98c","chunk-e2ef1232","chunk-2d20955d"],{"1a2c":function(t,e,n){"use strict";var o=n("77e1"),a=n.n(o);a.a},2855:function(t,e,n){"use strict";n.r(e);var o,a,c=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"container"},[n("div",{staticClass:"left-board"},[n("div",{staticClass:"logo-wrapper"},[n("div",{staticClass:"logo"},[n("img",{attrs:{src:t.logo,alt:"logo"}}),t._v(" Form Generator\n      ")])]),t._v(" "),n("el-scrollbar",{staticClass:"left-scrollbar"},[n("div",{staticClass:"components-list"},[n("div",{staticClass:"components-title"},[n("svg-icon",{attrs:{"icon-class":"component"}}),t._v("输入型组件\n        ")],1),t._v(" "),n("draggable",{staticClass:"components-draggable",attrs:{list:t.inputComponents,group:{name:"componentsGroup",pull:"clone",put:!1},clone:t.cloneComponent,draggable:".components-item",sort:!1},on:{end:t.onEnd}},t._l(t.inputComponents,(function(e,o){return n("div",{key:o,staticClass:"components-item",on:{click:function(n){return t.addComponent(e)}}},[n("div",{staticClass:"components-body"},[n("svg-icon",{attrs:{"icon-class":e.tagIcon}}),t._v("\n              "+t._s(e.label)+"\n            ")],1)])})),0),t._v(" "),n("div",{staticClass:"components-title"},[n("svg-icon",{attrs:{"icon-class":"component"}}),t._v("选择型组件\n        ")],1),t._v(" "),n("draggable",{staticClass:"components-draggable",attrs:{list:t.selectComponents,group:{name:"componentsGroup",pull:"clone",put:!1},clone:t.cloneComponent,draggable:".components-item",sort:!1},on:{end:t.onEnd}},t._l(t.selectComponents,(function(e,o){return n("div",{key:o,staticClass:"components-item",on:{click:function(n){return t.addComponent(e)}}},[n("div",{staticClass:"components-body"},[n("svg-icon",{attrs:{"icon-class":e.tagIcon}}),t._v("\n              "+t._s(e.label)+"\n            ")],1)])})),0),t._v(" "),n("div",{staticClass:"components-title"},[n("svg-icon",{attrs:{"icon-class":"component"}}),t._v(" 布局型组件\n        ")],1),t._v(" "),n("draggable",{staticClass:"components-draggable",attrs:{list:t.layoutComponents,group:{name:"componentsGroup",pull:"clone",put:!1},clone:t.cloneComponent,draggable:".components-item",sort:!1},on:{end:t.onEnd}},t._l(t.layoutComponents,(function(e,o){return n("div",{key:o,staticClass:"components-item",on:{click:function(n){return t.addComponent(e)}}},[n("div",{staticClass:"components-body"},[n("svg-icon",{attrs:{"icon-class":e.tagIcon}}),t._v("\n              "+t._s(e.label)+"\n            ")],1)])})),0)],1)])],1),t._v(" "),n("div",{staticClass:"center-board"},[n("div",{staticClass:"action-bar"},[n("el-button",{attrs:{icon:"el-icon-download",type:"text"},on:{click:t.download}},[t._v("\n        导出vue文件\n      ")]),t._v(" "),n("el-button",{staticClass:"copy-btn-main",attrs:{icon:"el-icon-document-copy",type:"text"},on:{click:t.copy}},[t._v("\n        复制代码\n      ")]),t._v(" "),n("el-button",{staticClass:"delete-btn",attrs:{icon:"el-icon-delete",type:"text"},on:{click:t.empty}},[t._v("\n        清空\n      ")])],1),t._v(" "),n("el-scrollbar",{staticClass:"center-scrollbar"},[n("el-row",{staticClass:"center-board-row",attrs:{gutter:t.formConf.gutter}},[n("el-form",{attrs:{size:t.formConf.size,"label-position":t.formConf.labelPosition,disabled:t.formConf.disabled,"label-width":t.formConf.labelWidth+"px"}},[n("draggable",{staticClass:"drawing-board",attrs:{list:t.drawingList,animation:340,group:"componentsGroup"}},t._l(t.drawingList,(function(e,o){return n("draggable-item",{key:e.renderKey,attrs:{"drawing-list":t.drawingList,element:e,index:o,"active-id":t.activeId,"form-conf":t.formConf},on:{activeItem:t.activeFormItem,copyItem:t.drawingItemCopy,deleteItem:t.drawingItemDelete}})})),1),t._v(" "),n("div",{directives:[{name:"show",rawName:"v-show",value:!t.drawingList.length,expression:"!drawingList.length"}],staticClass:"empty-info"},[t._v("\n            从左侧拖入或点选组件进行表单设计\n          ")])],1)],1)],1)],1),t._v(" "),n("right-panel",{attrs:{"active-data":t.activeData,"form-conf":t.formConf,"show-field":!!t.drawingList.length},on:{"tag-change":t.tagChange}}),t._v(" "),n("code-type-dialog",{attrs:{visible:t.dialogVisible,title:"选择生成类型","show-file-name":t.showFileName},on:{"update:visible":function(e){t.dialogVisible=e},confirm:t.generate}}),t._v(" "),n("input",{attrs:{id:"copyNode",type:"hidden"}})],1)},i=[],l=(n("20d6"),n("7618")),r=(n("456d"),n("ac6a"),n("db72")),s=(n("a481"),n("1980")),d=n.n(s),p=n("21a6"),u=n("e552"),f=n.n(u),m=n("b311"),h=n.n(m),v=n("a85b"),b=n("766b"),_=n("2e2a"),g=n("ed08");n("7f7f");function y(t){return'<el-dialog v-bind="$attrs" v-on="$listeners" @open="onOpen" @close="onClose" title="Dialog Titile">\n    '.concat(t,'\n    <div slot="footer">\n      <el-button @click="close">取消</el-button>\n      <el-button type="primary" @click="handelConfirm">确定</el-button>\n    </div>\n  </el-dialog>')}function w(t){return"<template>\n    <div>\n      ".concat(t,"\n    </div>\n  </template>")}function C(t){return"<script>\n    ".concat(t,"\n  <\/script>")}function O(t){return"<style>\n    ".concat(t,"\n  </style>")}function x(t,e,n){var o="";"right"!==t.labelPosition&&(o='label-position="'.concat(t.labelPosition,'"'));var c=t.disabled?':disabled="'.concat(t.disabled,'"'):"",i='<el-form ref="'.concat(t.formRef,'" :model="').concat(t.formModel,'" :rules="').concat(t.formRules,'" size="').concat(t.size,'" ').concat(c,' label-width="').concat(t.labelWidth,'px" ').concat(o,">\n      ").concat(e,"\n      ").concat(D(t,n),"\n    </el-form>");return a&&(i='<el-row :gutter="'.concat(t.gutter,'">\n        ').concat(i,"\n      </el-row>")),i}function D(t,e){var n="";return t.formBtns&&"file"===e&&(n='<el-form-item size="large">\n          <el-button type="primary" @click="submitForm">提交</el-button>\n          <el-button @click="resetForm">重置</el-button>\n        </el-form-item>',a&&(n='<el-col :span="24">\n          '.concat(n,"\n        </el-col>"))),n}function M(t,e){return a||24!==t.span?'<el-col :span="'.concat(t.span,'">\n      ').concat(e,"\n    </el-col>"):e}var E={colFormItem:function(t){var e="";t.labelWidth&&t.labelWidth!==o.labelWidth&&(e='label-width="'.concat(t.labelWidth,'px"'));var n=!_["e"][t.tag]&&t.required?"required":"",a=I[t.tag]?I[t.tag](t):null,c="<el-form-item ".concat(e,' label="').concat(t.label,'" prop="').concat(t.vModel,'" ').concat(n,">\n        ").concat(a,"\n      </el-form-item>");return c=M(t,c),c},rowFormItem:function(t){var e="default"===t.type?"":'type="'.concat(t.type,'"'),n="default"===t.type?"":'justify="'.concat(t.justify,'"'),o="default"===t.type?"":'align="'.concat(t.align,'"'),a=t.gutter?'gutter="'.concat(t.gutter,'"'):"",c=t.children.map((function(t){return E[t.layout](t)})),i="<el-row ".concat(e," ").concat(n," ").concat(o," ").concat(a,">\n      ").concat(c.join("\n"),"\n    </el-row>");return i=M(t,i),i}},I={"el-input":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=e.clearable,c=e.placeholder,i=e.width,l=t.maxlength?':maxlength="'.concat(t.maxlength,'"'):"",r=t["show-word-limit"]?"show-word-limit":"",s=t.readonly?"readonly":"",d=t["prefix-icon"]?"prefix-icon='".concat(t["prefix-icon"],"'"):"",p=t["suffix-icon"]?"suffix-icon='".concat(t["suffix-icon"],"'"):"",u=t["show-password"]?"show-password":"",f=t.type?'type="'.concat(t.type,'"'):"",m=t.autosize&&t.autosize.minRows?':autosize="{minRows: '.concat(t.autosize.minRows,", maxRows: ").concat(t.autosize.maxRows,'}"'):"",h=P(t);return h&&(h="\n".concat(h,"\n")),"<".concat(t.tag," ").concat(o," ").concat(f," ").concat(c," ").concat(l," ").concat(r," ").concat(s," ").concat(n," ").concat(a," ").concat(d," ").concat(p," ").concat(u," ").concat(m," ").concat(i,">").concat(h,"</").concat(t.tag,">")},"el-input-number":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=e.placeholder,c=t["controls-position"]?"controls-position=".concat(t["controls-position"]):"",i=t.min?":min='".concat(t.min,"'"):"",l=t.max?":max='".concat(t.max,"'"):"",r=t.step?":step='".concat(t.step,"'"):"",s=t["step-strictly"]?"step-strictly":"",d=t.precision?":precision='".concat(t.precision,"'"):"";return"<".concat(t.tag," ").concat(o," ").concat(a," ").concat(r," ").concat(s," ").concat(d," ").concat(c," ").concat(i," ").concat(l," ").concat(n,"></").concat(t.tag,">")},"el-select":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=e.clearable,c=e.placeholder,i=e.width,l=t.filterable?"filterable":"",r=t.multiple?"multiple":"",s=j(t);return s&&(s="\n".concat(s,"\n")),"<".concat(t.tag," ").concat(o," ").concat(c," ").concat(n," ").concat(r," ").concat(l," ").concat(a," ").concat(i,">").concat(s,"</").concat(t.tag,">")},"el-radio-group":function(t){var e=k(t),n=e.disabled,o=e.vModel,a='size="'.concat(t.size,'"'),c=A(t);return c&&(c="\n".concat(c,"\n")),"<".concat(t.tag," ").concat(o," ").concat(a," ").concat(n,">").concat(c,"</").concat(t.tag,">")},"el-checkbox-group":function(t){var e=k(t),n=e.disabled,o=e.vModel,a='size="'.concat(t.size,'"'),c=t.min?':min="'.concat(t.min,'"'):"",i=t.max?':max="'.concat(t.max,'"'):"",l=L(t);return l&&(l="\n".concat(l,"\n")),"<".concat(t.tag," ").concat(o," ").concat(c," ").concat(i," ").concat(a," ").concat(n,">").concat(l,"</").concat(t.tag,">")},"el-switch":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=t["active-text"]?'active-text="'.concat(t["active-text"],'"'):"",c=t["inactive-text"]?'inactive-text="'.concat(t["inactive-text"],'"'):"",i=t["active-color"]?'active-color="'.concat(t["active-color"],'"'):"",l=t["inactive-color"]?'inactive-color="'.concat(t["inactive-color"],'"'):"",r=!0!==t["active-value"]?":active-value='".concat(JSON.stringify(t["active-value"]),"'"):"",s=!1!==t["inactive-value"]?":inactive-value='".concat(JSON.stringify(t["inactive-value"]),"'"):"";return"<".concat(t.tag," ").concat(o," ").concat(a," ").concat(c," ").concat(i," ").concat(l," ").concat(r," ").concat(s," ").concat(n,"></").concat(t.tag,">")},"el-cascader":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=e.clearable,c=e.placeholder,i=e.width,l=t.options?':options="'.concat(t.vModel,'Options"'):"",r=t.props?':props="'.concat(t.vModel,'Props"'):"",s=t["show-all-levels"]?"":':show-all-levels="false"',d=t.filterable?"filterable":"",p="/"===t.separator?"":'separator="'.concat(t.separator,'"');return"<".concat(t.tag," ").concat(o," ").concat(l," ").concat(r," ").concat(i," ").concat(s," ").concat(c," ").concat(p," ").concat(d," ").concat(a," ").concat(n,"></").concat(t.tag,">")},"el-slider":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=t.min?":min='".concat(t.min,"'"):"",c=t.max?":max='".concat(t.max,"'"):"",i=t.step?":step='".concat(t.step,"'"):"",l=t.range?"range":"",r=t["show-stops"]?':show-stops="'.concat(t["show-stops"],'"'):"";return"<".concat(t.tag," ").concat(a," ").concat(c," ").concat(i," ").concat(o," ").concat(l," ").concat(r," ").concat(n,"></").concat(t.tag,">")},"el-time-picker":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=e.clearable,c=e.placeholder,i=e.width,l=t["start-placeholder"]?'start-placeholder="'.concat(t["start-placeholder"],'"'):"",r=t["end-placeholder"]?'end-placeholder="'.concat(t["end-placeholder"],'"'):"",s=t["range-separator"]?'range-separator="'.concat(t["range-separator"],'"'):"",d=t["is-range"]?"is-range":"",p=t.format?'format="'.concat(t.format,'"'):"",u=t["value-format"]?'value-format="'.concat(t["value-format"],'"'):"",f=t["picker-options"]?":picker-options='".concat(JSON.stringify(t["picker-options"]),"'"):"";return"<".concat(t.tag," ").concat(o," ").concat(d," ").concat(p," ").concat(u," ").concat(f," ").concat(i," ").concat(c," ").concat(l," ").concat(r," ").concat(s," ").concat(a," ").concat(n,"></").concat(t.tag,">")},"el-date-picker":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=e.clearable,c=e.placeholder,i=e.width,l=t["start-placeholder"]?'start-placeholder="'.concat(t["start-placeholder"],'"'):"",r=t["end-placeholder"]?'end-placeholder="'.concat(t["end-placeholder"],'"'):"",s=t["range-separator"]?'range-separator="'.concat(t["range-separator"],'"'):"",d=t.format?'format="'.concat(t.format,'"'):"",p=t["value-format"]?'value-format="'.concat(t["value-format"],'"'):"",u="date"===t.type?"":'type="'.concat(t.type,'"'),f=t.readonly?"readonly":"";return"<".concat(t.tag," ").concat(u," ").concat(o," ").concat(d," ").concat(p," ").concat(i," ").concat(c," ").concat(l," ").concat(r," ").concat(s," ").concat(a," ").concat(f," ").concat(n,"></").concat(t.tag,">")},"el-rate":function(t){var e=k(t),n=e.disabled,o=e.vModel,a=(t.max&&":max='".concat(t.max,"'"),t["allow-half"]?"allow-half":""),c=t["show-text"]?"show-text":"",i=t["show-score"]?"show-score":"";return"<".concat(t.tag," ").concat(o," ").concat(a," ").concat(c," ").concat(i," ").concat(n,"></").concat(t.tag,">")},"el-color-picker":function(t){var e=k(t),n=e.disabled,o=e.vModel,a='size="'.concat(t.size,'"'),c=t["show-alpha"]?"show-alpha":"",i=t["color-format"]?'color-format="'.concat(t["color-format"],'"'):"";return"<".concat(t.tag," ").concat(o," ").concat(a," ").concat(c," ").concat(i," ").concat(n,"></").concat(t.tag,">")},"el-upload":function(t){var e=t.disabled?":disabled='true'":"",n=t.action?':action="'.concat(t.vModel,'Action"'):"",o=t.multiple?"multiple":"",a="text"!==t["list-type"]?'list-type="'.concat(t["list-type"],'"'):"",c=t.accept?'accept="'.concat(t.accept,'"'):"",i="file"!==t.name?'name="'.concat(t.name,'"'):"",l=!1===t["auto-upload"]?':auto-upload="false"':"",r=':before-upload="'.concat(t.vModel,'BeforeUpload"'),s=':file-list="'.concat(t.vModel,'fileList"'),d='ref="'.concat(t.vModel,'"'),p=T(t);return p&&(p="\n".concat(p,"\n")),"<".concat(t.tag," ").concat(d," ").concat(s," ").concat(n," ").concat(l," ").concat(o," ").concat(r," ").concat(a," ").concat(c," ").concat(i," ").concat(e,">").concat(p,"</").concat(t.tag,">")}};function k(t){return{vModel:'v-model="'.concat(o.formModel,".").concat(t.vModel,'"'),clearable:t.clearable?"clearable":"",placeholder:t.placeholder?'placeholder="'.concat(t.placeholder,'"'):"",width:t.style&&t.style.width?":style=\"{width: '100%'}\"":"",disabled:t.disabled?":disabled='true'":""}}function P(t){var e=[];return t.prepend&&e.push('<template slot="prepend">'.concat(t.prepend,"</template>")),t.append&&e.push('<template slot="append">'.concat(t.append,"</template>")),e.join("\n")}function j(t){var e=[];return t.options&&t.options.length&&e.push('<el-option v-for="(item, index) in '.concat(t.vModel,'Options" :key="index" :label="item.label" :value="item.value" :disabled="item.disabled"></el-option>')),e.join("\n")}function A(t){var e=[];if(t.options&&t.options.length){var n="button"===t.optionType?"el-radio-button":"el-radio",o=t.border?"border":"";e.push("<".concat(n,' v-for="(item, index) in ').concat(t.vModel,'Options" :key="index" :label="item.value" :disabled="item.disabled" ').concat(o,">{{item.label}}</").concat(n,">"))}return e.join("\n")}function L(t){var e=[];if(t.options&&t.options.length){var n="button"===t.optionType?"el-checkbox-button":"el-checkbox",o=t.border?"border":"";e.push("<".concat(n,' v-for="(item, index) in ').concat(t.vModel,'Options" :key="index" :label="item.value" :disabled="item.disabled" ').concat(o,">{{item.label}}</").concat(n,">"))}return e.join("\n")}function T(t){var e=[];return"picture-card"===t["list-type"]?e.push('<i class="el-icon-plus"></i>'):e.push('<el-button size="small" type="primary" icon="el-icon-upload">'.concat(t.buttonText,"</el-button>")),t.showTip&&e.push('<div slot="tip" class="el-upload__tip">只能上传不超过 '.concat(t.fileSize).concat(t.sizeUnit," 的").concat(t.accept,"文件</div>")),e.join("\n")}function N(t,e){var n=[];o=t,a=t.fields.some((function(t){return 24!==t.span})),t.fields.forEach((function(t){n.push(E[t.layout](t))}));var c=n.join("\n"),i=x(t,c,e);return"dialog"===e&&(i=y(i)),o=null,i}var R=n("80de"),F={"el-rate":".el-rate{display: inline-block; vertical-align: text-top;}","el-upload":".el-upload__tip{line-height: 1.2;}"};function z(t,e){var n=F[e.tag];n&&-1===t.indexOf(n)&&t.push(n),e.children&&e.children.forEach((function(e){return z(t,e)}))}function B(t){var e=[];return t.fields.forEach((function(t){return z(e,t)})),e.join("\n")}var K,U,$=[{layout:"colFormItem",tagIcon:"input",label:"手机号",vModel:"mobile",formId:6,tag:"el-input",placeholder:"请输入手机号",defaultValue:"",span:24,style:{width:"100%"},clearable:!0,prepend:"",append:"","prefix-icon":"el-icon-mobile","suffix-icon":"",maxlength:11,"show-word-limit":!0,readonly:!1,disabled:!1,required:!0,changeTag:!0,regList:[{pattern:"/^1(3|4|5|7|8|9)\\d{9}$/",message:"手机号格式错误"}]}],W=n("81a5"),S=n.n(W),G=n("a92a"),q=n("4923"),J={components:{draggable:d.a,render:v["a"],RightPanel:b["default"],CodeTypeDialog:G["default"],DraggableItem:q["default"]},data:function(){return{logo:S.a,idGlobal:100,formConf:_["a"],inputComponents:_["b"],selectComponents:_["d"],layoutComponents:_["c"],labelWidth:100,drawingList:$,drawingData:{},activeId:$[0].formId,drawerVisible:!1,formData:{},dialogVisible:!1,generateConf:null,showFileName:!1,activeData:$[0]}},computed:{},watch:{"activeData.label":function(t,e){void 0!==this.activeData.placeholder&&this.activeData.tag&&K===this.activeId&&(this.activeData.placeholder=this.activeData.placeholder.replace(e,"")+t)},activeId:{handler:function(t){K=t},immediate:!0}},mounted:function(){var t=this,e=new h.a("#copyNode",{text:function(e){var n=t.generateCode();return t.$notify({title:"成功",message:"代码已复制到剪切板，可粘贴。",type:"success"}),n}});e.on("error",(function(e){t.$message.error("代码复制失败")}))},methods:{activeFormItem:function(t){this.activeData=t,this.activeId=t.formId},onEnd:function(t,e){t.from!==t.to&&(this.activeData=U,this.activeId=this.idGlobal)},addComponent:function(t){var e=this.cloneComponent(t);this.drawingList.push(e),this.activeFormItem(e)},cloneComponent:function(t){var e=JSON.parse(JSON.stringify(t));return e.formId=++this.idGlobal,e.span=_["a"].span,e.renderKey=+new Date,e.layout||(e.layout="colFormItem"),"colFormItem"===e.layout?(e.vModel="field".concat(this.idGlobal),void 0!==e.placeholder&&(e.placeholder+=e.label),U=e):"rowFormItem"===e.layout&&(delete e.label,e.componentName="row".concat(this.idGlobal),e.gutter=this.formConf.gutter,U=e),U},AssembleFormData:function(){this.formData=Object(r["a"])({fields:JSON.parse(JSON.stringify(this.drawingList))},this.formConf)},generate:function(t){var e=this["exec".concat(Object(g["h"])(this.operationType))];this.generateConf=t,e&&e(t)},execRun:function(t){this.AssembleFormData(),this.drawerVisible=!0},execDownload:function(t){var e=this.generateCode(),n=new Blob([e],{type:"text/plain;charset=utf-8"});Object(p["saveAs"])(n,t.fileName)},execCopy:function(t){document.getElementById("copyNode").click()},empty:function(){var t=this;this.$confirm("确定要清空所有组件吗？","提示",{type:"warning"}).then((function(){t.drawingList=[]}))},drawingItemCopy:function(t,e){var n=JSON.parse(JSON.stringify(t));n=this.createIdAndKey(n),e.push(n),this.activeFormItem(n)},createIdAndKey:function(t){var e=this;return t.formId=++this.idGlobal,t.renderKey=+new Date,"colFormItem"===t.layout?t.vModel="field".concat(this.idGlobal):"rowFormItem"===t.layout&&(t.componentName="row".concat(this.idGlobal)),Array.isArray(t.children)&&(t.children=t.children.map((function(t){return e.createIdAndKey(t)}))),t},drawingItemDelete:function(t,e){var n=this;e.splice(t,1),this.$nextTick((function(){var t=n.drawingList.length;t&&n.activeFormItem(n.drawingList[t-1])}))},generateCode:function(){var t=this.generateConf.type;this.AssembleFormData();var e=C(Object(R["a"])(this.formData,t)),n=w(N(this.formData,t)),o=O(B(this.formData));return f.a.html(n+e+o,g["b"].html)},download:function(){this.dialogVisible=!0,this.showFileName=!0,this.operationType="download"},run:function(){this.dialogVisible=!0,this.showFileName=!1,this.operationType="run"},copy:function(){this.dialogVisible=!0,this.showFileName=!1,this.operationType="copy"},tagChange:function(t){var e=this;t=this.cloneComponent(t),t.vModel=this.activeData.vModel,t.formId=this.activeId,t.span=this.activeData.span,delete this.activeData.tag,delete this.activeData.tagIcon,delete this.activeData.document,Object.keys(t).forEach((function(n){void 0!==e.activeData[n]&&Object(l["a"])(e.activeData[n])===Object(l["a"])(t[n])&&(t[n]=e.activeData[n])})),this.activeData=t,this.updateDrawingList(t,this.drawingList)},updateDrawingList:function(t,e){var n=this,o=e.findIndex((function(t){return t.formId===n.activeId}));o>-1?e.splice(o,1,t):e.forEach((function(e){Array.isArray(e.children)&&n.updateDrawingList(t,e.children)}))}}},V=J,H=(n("1a2c"),n("2877")),Q=Object(H["a"])(V,c,i,!1,null,null,null);e["default"]=Q.exports},4923:function(t,e,n){"use strict";n.r(e);var o=n("1980"),a=n.n(o),c=n("a85b"),i={itemBtns:function(t,e,n,o){var a=this.$listeners,c=a.copyItem,i=a.deleteItem;return[t("span",{class:"drawing-item-copy",attrs:{title:"复制"},on:{click:function(t){c(e,o),t.stopPropagation()}}},[t("i",{class:"el-icon-copy-document"})]),t("span",{class:"drawing-item-delete",attrs:{title:"删除"},on:{click:function(t){i(n,o),t.stopPropagation()}}},[t("i",{class:"el-icon-delete"})])]}},l={colFormItem:function(t,e,n,o){var a=this,l=this.$listeners.activeItem,r=this.activeId===e.formId?"drawing-item active-from-item":"drawing-item";return this.formConf.unFocusedComponentBorder&&(r+=" unfocus-bordered"),t("el-col",{attrs:{span:e.span},class:r,nativeOn:{click:function(t){l(e),t.stopPropagation()}}},[t("el-form-item",{attrs:{"label-width":e.labelWidth?"".concat(e.labelWidth,"px"):null,label:e.label,required:e.required}},[t(c["a"],{key:e.renderKey,attrs:{conf:e},on:{input:function(t){a.$set(e,"defaultValue",t)}}})]),i.itemBtns.apply(this,arguments)])},rowFormItem:function(t,e,n,o){var c=this.$listeners.activeItem,l=this.activeId===e.formId?"drawing-row-item active-from-item":"drawing-row-item",s=r.apply(this,arguments);return"flex"===e.type&&(s=t("el-row",{attrs:{type:e.type,justify:e.justify,align:e.align}},[s])),t("el-col",{attrs:{span:e.span}},[t("el-row",{attrs:{gutter:e.gutter},class:l,nativeOn:{click:function(t){c(e),t.stopPropagation()}}},[t("span",{class:"component-name"},[e.componentName]),t(a.a,{attrs:{list:e.children,animation:340,group:"componentsGroup"},class:"drag-wrapper"},[s]),i.itemBtns.apply(this,arguments)])])}};function r(t,e,n,o){var a=this;return Array.isArray(e.children)?e.children.map((function(n,o){var c=l[n.layout];return c?c.call(a,t,n,o,e.children):s()})):null}function s(){throw new Error("没有与".concat(this.element.layout,"匹配的layout"))}var d,p,u={components:{render:c["a"],draggable:a.a},props:["element","index","drawingList","activeId","formConf"],render:function(t){var e=l[this.element.layout];return e?e.call(this,t,this.element,this.index,this.drawingList):s()}},f=u,m=n("2877"),h=Object(m["a"])(f,d,p,!1,null,null,null);e["default"]=h.exports},"77e1":function(t,e,n){},"80de":function(module,__webpack_exports__,__webpack_require__){"use strict";__webpack_require__.d(__webpack_exports__,"a",(function(){return makeUpJs}));var core_js_modules_es6_object_keys__WEBPACK_IMPORTED_MODULE_0__=__webpack_require__("456d"),core_js_modules_es6_object_keys__WEBPACK_IMPORTED_MODULE_0___default=__webpack_require__.n(core_js_modules_es6_object_keys__WEBPACK_IMPORTED_MODULE_0__),core_js_modules_web_dom_iterable__WEBPACK_IMPORTED_MODULE_1__=__webpack_require__("ac6a"),core_js_modules_web_dom_iterable__WEBPACK_IMPORTED_MODULE_1___default=__webpack_require__.n(core_js_modules_web_dom_iterable__WEBPACK_IMPORTED_MODULE_1__),util__WEBPACK_IMPORTED_MODULE_2__=__webpack_require__("3022"),util__WEBPACK_IMPORTED_MODULE_2___default=__webpack_require__.n(util__WEBPACK_IMPORTED_MODULE_2__),_utils_index__WEBPACK_IMPORTED_MODULE_3__=__webpack_require__("ed08"),_config__WEBPACK_IMPORTED_MODULE_4__=__webpack_require__("2e2a"),units={KB:"1024",MB:"1024 / 1024",GB:"1024 / 1024 / 1024"},confGlobal,inheritAttrs={file:"",dialog:"inheritAttrs: false,"};function makeUpJs(t,e){confGlobal=t=JSON.parse(JSON.stringify(t));var n=[],o=[],a=[],c=[],i=mixinMethod(e),l=[];t.fields.forEach((function(t){buildAttributes(t,n,o,a,i,c,l)}));var r=buildexport(t,e,n.join("\n"),o.join("\n"),a.join("\n"),l.join("\n"),c.join("\n"),i.join("\n"));return confGlobal=null,r}function buildAttributes(t,e,n,o,a,c,i){if(buildData(t,e),buildRules(t,n),t.options&&t.options.length&&(buildOptions(t,o),"dynamic"===t.dataType)){var l="".concat(t.vModel,"Options"),r=Object(_utils_index__WEBPACK_IMPORTED_MODULE_3__["h"])(l);buildOptionMethod("get".concat(r),l,a)}t.props&&t.props.props&&buildProps(t,c),t.action&&"el-upload"===t.tag&&(i.push("".concat(t.vModel,"Action: '").concat(t.action,"',\n      ").concat(t.vModel,"fileList: [],")),a.push(buildBeforeUpload(t)),t["auto-upload"]||a.push(buildSubmitUpload(t))),t.children&&t.children.forEach((function(t){buildAttributes(t,e,n,o,a,c,i)}))}function mixinMethod(t){var e=[],n={file:confGlobal.formBtns?{submitForm:"submitForm() {\n        this.$refs['".concat(confGlobal.formRef,"'].validate(valid => {\n          if(!valid) return\n          // TODO 提交表单\n        })\n      },"),resetForm:"resetForm() {\n        this.$refs['".concat(confGlobal.formRef,"'].resetFields()\n      },")}:null,dialog:{onOpen:"onOpen() {},",onClose:"onClose() {\n        this.$refs['".concat(confGlobal.formRef,"'].resetFields()\n      },"),close:"close() {\n        this.$emit('update:visible', false)\n      },",handelConfirm:"handelConfirm() {\n        this.$refs['".concat(confGlobal.formRef,"'].validate(valid => {\n          if(!valid) return\n          this.close()\n        })\n      },")}},o=n[t];return o&&Object.keys(o).forEach((function(t){e.push(o[t])})),e}function buildData(t,e){var n;void 0!==t.vModel&&(n="string"!==typeof t.defaultValue||t.multiple?"".concat(JSON.stringify(t.defaultValue)):"'".concat(t.defaultValue,"'"),e.push("".concat(t.vModel,": ").concat(n,",")))}function buildRules(conf,ruleList){if(void 0!==conf.vModel){var rules=[];if(_config__WEBPACK_IMPORTED_MODULE_4__["e"][conf.tag]){if(conf.required){var type=Object(util__WEBPACK_IMPORTED_MODULE_2__["isArray"])(conf.defaultValue)?"type: 'array',":"",message=Object(util__WEBPACK_IMPORTED_MODULE_2__["isArray"])(conf.defaultValue)?"请至少选择一个".concat(conf.vModel):conf.placeholder;void 0===message&&(message="".concat(conf.label,"不能为空")),rules.push("{ required: true, ".concat(type," message: '").concat(message,"', trigger: '").concat(_config__WEBPACK_IMPORTED_MODULE_4__["e"][conf.tag],"' }"))}conf.regList&&Object(util__WEBPACK_IMPORTED_MODULE_2__["isArray"])(conf.regList)&&conf.regList.forEach((function(item){item.pattern&&rules.push("{ pattern: ".concat(eval(item.pattern),", message: '").concat(item.message,"', trigger: '").concat(_config__WEBPACK_IMPORTED_MODULE_4__["e"][conf.tag],"' }"))})),ruleList.push("".concat(conf.vModel,": [").concat(rules.join(","),"],"))}}}function buildOptions(t,e){if(void 0!==t.vModel){"dynamic"===t.dataType&&(t.options=[]);var n="".concat(t.vModel,"Options: ").concat(JSON.stringify(t.options),",");e.push(n)}}function buildProps(t,e){"dynamic"===t.dataType&&("value"!==t.valueKey&&(t.props.props.value=t.valueKey),"label"!==t.labelKey&&(t.props.props.label=t.labelKey),"children"!==t.childrenKey&&(t.props.props.children=t.childrenKey));var n="".concat(t.vModel,"Props: ").concat(JSON.stringify(t.props.props),",");e.push(n)}function buildBeforeUpload(t){var e=units[t.sizeUnit],n="",o="",a=[];t.fileSize&&(n="let isRightSize = file.size / ".concat(e," < ").concat(t.fileSize,"\n    if(!isRightSize){\n      this.$message.error('文件大小超过 ").concat(t.fileSize).concat(t.sizeUnit,"')\n    }"),a.push("isRightSize")),t.accept&&(o="let isAccept = new RegExp('".concat(t.accept,"').test(file.type)\n    if(!isAccept){\n      this.$message.error('应该选择").concat(t.accept,"类型的文件')\n    }"),a.push("isAccept"));var c="".concat(t.vModel,"BeforeUpload(file) {\n    ").concat(n,"\n    ").concat(o,"\n    return ").concat(a.join("&&"),"\n  },");return a.length?c:""}function buildSubmitUpload(t){var e="submitUpload() {\n    this.$refs['".concat(t.vModel,"'].submit()\n  },");return e}function buildOptionMethod(t,e,n){var o="".concat(t,"() {\n    // TODO 发起请求获取数据\n    this.").concat(e,"\n  },");n.push(o)}function buildexport(t,e,n,o,a,c,i,l){var r="".concat(_utils_index__WEBPACK_IMPORTED_MODULE_3__["d"],"{\n  ").concat(inheritAttrs[e],"\n  components: {},\n  props: [],\n  data () {\n    return {\n      ").concat(t.formModel,": {\n        ").concat(n,"\n      },\n      ").concat(t.formRules,": {\n        ").concat(o,"\n      },\n      ").concat(c,"\n      ").concat(a,"\n      ").concat(i,"\n    }\n  },\n  computed: {},\n  watch: {},\n  created () {},\n  mounted () {},\n  methods: {\n    ").concat(l,"\n  }\n}");return r}},a85b:function(t,e,n){"use strict";n("456d"),n("ac6a");var o=n("ed08"),a=Object(o["f"])("accept,accept-charset,accesskey,action,align,alt,async,autocomplete,autofocus,autoplay,autosave,bgcolor,border,buffered,challenge,charset,checked,cite,class,code,codebase,color,cols,colspan,content,http-equiv,name,contenteditable,contextmenu,controls,coords,data,datetime,default,defer,dir,dirname,disabled,download,draggable,dropzone,enctype,method,for,form,formaction,headers,height,hidden,high,href,hreflang,http-equiv,icon,id,ismap,itemprop,keytype,kind,label,lang,language,list,loop,low,manifest,max,maxlength,media,method,GET,POST,min,multiple,email,file,muted,name,novalidate,open,optimum,pattern,ping,placeholder,poster,preload,radiogroup,readonly,rel,required,reversed,rows,rowspan,sandbox,scope,scoped,seamless,selected,shape,size,type,text,password,sizes,span,spellcheck,src,srcdoc,srclang,srcset,start,step,style,summary,tabindex,target,title,type,usemap,value,width,wrap");function c(t,e,n){e.props.value=n,e.on.input=function(e){t.$emit("input",e)}}var i={"el-input":{prepend:function(t,e,n){return t("template",{slot:"prepend"},[e[n]])},append:function(t,e,n){return t("template",{slot:"append"},[e[n]])}},"el-select":{options:function(t,e,n){var o=[];return e.options.forEach((function(e){o.push(t("el-option",{attrs:{label:e.label,value:e.value,disabled:e.disabled}}))})),o}},"el-radio-group":{options:function(t,e,n){var o=[];return e.options.forEach((function(n){"button"===e.optionType?o.push(t("el-radio-button",{attrs:{label:n.value}},[n.label])):o.push(t("el-radio",{attrs:{label:n.value,border:e.border}},[n.label]))})),o}},"el-checkbox-group":{options:function(t,e,n){var o=[];return e.options.forEach((function(n){"button"===e.optionType?o.push(t("el-checkbox-button",{attrs:{label:n.value}},[n.label])):o.push(t("el-checkbox",{attrs:{label:n.value,border:e.border}},[n.label]))})),o}},"el-upload":{"list-type":function(t,e,n){var o=[];return"picture-card"===e["list-type"]?o.push(t("i",{class:"el-icon-plus"})):o.push(t("el-button",{attrs:{size:"small",type:"primary",icon:"el-icon-upload"}},[e.buttonText])),e.showTip&&o.push(t("div",{slot:"tip",class:"el-upload__tip"},["只能上传不超过 ",e.fileSize,e.sizeUnit," 的",e.accept,"文件"])),o}}};e["a"]={render:function(t){var e=this,n={attrs:{},props:{},on:{},style:{}},o=JSON.parse(JSON.stringify(this.conf)),l=[],r=i[o.tag];return r&&Object.keys(r).forEach((function(e){var n=r[e];o[e]&&l.push(n(t,o,e))})),Object.keys(o).forEach((function(t){var i=o[t];"vModel"===t?c(e,n,o.defaultValue):n[t]?n[t]=i:a(t)?n.attrs[t]=i:n.props[t]=i})),t(this.conf.tag,n,l)},props:["conf"]}},a92a:function(t,e,n){"use strict";n.r(e);var o=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("el-dialog",t._g(t._b({attrs:{width:"500px","close-on-click-modal":!1,"modal-append-to-body":!1},on:{open:t.onOpen,close:t.onClose}},"el-dialog",t.$attrs,!1),t.$listeners),[n("el-row",{attrs:{gutter:15}},[n("el-form",{ref:"elForm",attrs:{model:t.formData,rules:t.rules,size:"medium","label-width":"100px"}},[n("el-col",{attrs:{span:24}},[n("el-form-item",{attrs:{label:"生成类型",prop:"type"}},[n("el-radio-group",{model:{value:t.formData.type,callback:function(e){t.$set(t.formData,"type",e)},expression:"formData.type"}},t._l(t.typeOptions,(function(e,o){return n("el-radio-button",{key:o,attrs:{label:e.value,disabled:e.disabled}},[t._v("\n                "+t._s(e.label)+"\n              ")])})),1)],1),t._v(" "),t.showFileName?n("el-form-item",{attrs:{label:"文件名",prop:"fileName"}},[n("el-input",{attrs:{placeholder:"请输入文件名",clearable:""},model:{value:t.formData.fileName,callback:function(e){t.$set(t.formData,"fileName",e)},expression:"formData.fileName"}})],1):t._e()],1)],1)],1),t._v(" "),n("div",{attrs:{slot:"footer"},slot:"footer"},[n("el-button",{on:{click:t.close}},[t._v("\n        取消\n      ")]),t._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:t.handelConfirm}},[t._v("\n        确定\n      ")])],1)],1)],1)},a=[],c=n("db72"),i={inheritAttrs:!1,props:["showFileName"],data:function(){return{formData:{fileName:void 0,type:"file"},rules:{fileName:[{required:!0,message:"请输入文件名",trigger:"blur"}],type:[{required:!0,message:"生成类型不能为空",trigger:"change"}]},typeOptions:[{label:"页面",value:"file"},{label:"弹窗",value:"dialog"}]}},computed:{},watch:{},mounted:function(){},methods:{onOpen:function(){this.showFileName&&(this.formData.fileName="".concat(+new Date,".vue"))},onClose:function(){},close:function(t){this.$emit("update:visible",!1)},handelConfirm:function(){var t=this;this.$refs.elForm.validate((function(e){e&&(t.$emit("confirm",Object(c["a"])({},t.formData)),t.close())}))}}},l=i,r=n("2877"),s=Object(r["a"])(l,o,a,!1,null,null,null);e["default"]=s.exports}}]);