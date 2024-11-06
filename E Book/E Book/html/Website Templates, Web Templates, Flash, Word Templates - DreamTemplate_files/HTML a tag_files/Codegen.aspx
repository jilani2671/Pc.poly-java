
funcStrings = {Depart:"Depart",Return:"Return",Search:"Search",Flight:"Flight",Title1:"Find The World's Cheapest Flight tickets",Title2:"within period of 30 days",ViewPrice:"View price"};
func_months = [[2009,7,'Next 30 days'],[2009,8,'August'],[2009,9,'September'],[2009,10,'October'],[2009,11,'November'],[2009,12,'December']];
func_currencies = ['EUR','NOK','DKK','USD','SEK','GBP','ESP'];
var _arrLang = new Object();
_arrLang["Depart"] = funcStrings.Depart;_arrLang["Return"] = funcStrings.Return;_arrLang["AveragePrice"]="Average price";_arrLang["GetFlights"]="Getting flights...";_arrLang["NotAvailable"]="not available";_arrLang["Price"]="Price";_arrLang["Date"]="Date";

var _FD0 = [{DAY:"1",DATE:"07/01/2009",DDATE:"01/07/2009",WK:"0",FARE:207},{DAY:"2",DATE:"07/02/2009",DDATE:"02/07/2009",WK:"0",FARE:276},{DAY:"3",DATE:"07/03/2009",DDATE:"03/07/2009",WK:"0",FARE:209},{DAY:"4",DATE:"07/04/2009",DDATE:"04/07/2009",WK:"1",FARE:214},{DAY:"5",DATE:"07/05/2009",DDATE:"05/07/2009",WK:"1",FARE:210},{DAY:"6",DATE:"07/06/2009",DDATE:"06/07/2009",WK:"0",FARE:230},{DAY:"7",DATE:"07/07/2009",DDATE:"07/07/2009",WK:"0",FARE:85},{DAY:"8",DATE:"07/08/2009",DDATE:"08/07/2009",WK:"0",FARE:226},{DAY:"9",DATE:"07/09/2009",DDATE:"09/07/2009",WK:"0",FARE:242},{DAY:"10",DATE:"07/10/2009",DDATE:"10/07/2009",WK:"0",FARE:264},{DAY:"11",DATE:"07/11/2009",DDATE:"11/07/2009",WK:"1",FARE:251},{DAY:"12",DATE:"07/12/2009",DDATE:"12/07/2009",WK:"1",FARE:225},{DAY:"13",DATE:"07/13/2009",DDATE:"13/07/2009",WK:"0",FARE:225},{DAY:"14",DATE:"07/14/2009",DDATE:"14/07/2009",WK:"0",FARE:145},{DAY:"15",DATE:"07/15/2009",DDATE:"15/07/2009",WK:"0",FARE:245},{DAY:"16",DATE:"07/16/2009",DDATE:"16/07/2009",WK:"0",FARE:238},{DAY:"17",DATE:"07/17/2009",DDATE:"17/07/2009",WK:"0",FARE:241},{DAY:"18",DATE:"07/18/2009",DDATE:"18/07/2009",WK:"1",FARE:255},{DAY:"19",DATE:"07/19/2009",DDATE:"19/07/2009",WK:"1",FARE:241},{DAY:"20",DATE:"07/20/2009",DDATE:"20/07/2009",WK:"0",FARE:231},{DAY:"21",DATE:"07/21/2009",DDATE:"21/07/2009",WK:"0",FARE:80},{DAY:"22",DATE:"07/22/2009",DDATE:"22/07/2009",WK:"0",FARE:75},{DAY:"23",DATE:"07/23/2009",DDATE:"23/07/2009",WK:"0",FARE:24},{DAY:"24",DATE:"07/24/2009",DDATE:"24/07/2009",WK:"0",FARE:25},{DAY:"25",DATE:"07/25/2009",DDATE:"25/07/2009",WK:"1",FARE:72},{DAY:"26",DATE:"07/26/2009",DDATE:"26/07/2009",WK:"1",FARE:21},{DAY:"27",DATE:"07/27/2009",DDATE:"27/07/2009",WK:"0",FARE:24},{DAY:"28",DATE:"07/28/2009",DDATE:"28/07/2009",WK:"0",FARE:169},{DAY:"29",DATE:"07/29/2009",DDATE:"29/07/2009",WK:"0",FARE:93},{DAY:"30",DATE:"07/30/2009",DDATE:"30/07/2009",WK:"0",FARE:32},{DAY:"31",DATE:"07/31/2009",DDATE:"31/07/2009",WK:"0",FARE:44}];

var _FD1 = [{DAY:"1",DATE:"07/01/2009",DDATE:"01/07/2009",WK:"0",FARE:363},{DAY:"2",DATE:"07/02/2009",DDATE:"02/07/2009",WK:"0",FARE:276},{DAY:"3",DATE:"07/03/2009",DDATE:"03/07/2009",WK:"0",FARE:320},{DAY:"4",DATE:"07/04/2009",DDATE:"04/07/2009",WK:"1",FARE:366},{DAY:"5",DATE:"07/05/2009",DDATE:"05/07/2009",WK:"1",FARE:365},{DAY:"6",DATE:"07/06/2009",DDATE:"06/07/2009",WK:"0",FARE:350},{DAY:"7",DATE:"07/07/2009",DDATE:"07/07/2009",WK:"0",FARE:281},{DAY:"8",DATE:"07/08/2009",DDATE:"08/07/2009",WK:"0",FARE:317},{DAY:"9",DATE:"07/09/2009",DDATE:"09/07/2009",WK:"0",FARE:289},{DAY:"10",DATE:"07/10/2009",DDATE:"10/07/2009",WK:"0",FARE:303},{DAY:"11",DATE:"07/11/2009",DDATE:"11/07/2009",WK:"1",FARE:366},{DAY:"12",DATE:"07/12/2009",DDATE:"12/07/2009",WK:"1",FARE:382},{DAY:"13",DATE:"07/13/2009",DDATE:"13/07/2009",WK:"0",FARE:355},{DAY:"14",DATE:"07/14/2009",DDATE:"14/07/2009",WK:"0",FARE:346},{DAY:"15",DATE:"07/15/2009",DDATE:"15/07/2009",WK:"0",FARE:400},{DAY:"16",DATE:"07/16/2009",DDATE:"16/07/2009",WK:"0",FARE:280},{DAY:"17",DATE:"07/17/2009",DDATE:"17/07/2009",WK:"0",FARE:144},{DAY:"18",DATE:"07/18/2009",DDATE:"18/07/2009",WK:"1",FARE:108},{DAY:"19",DATE:"07/19/2009",DDATE:"19/07/2009",WK:"1",FARE:189},{DAY:"20",DATE:"07/20/2009",DDATE:"20/07/2009",WK:"0",FARE:163},{DAY:"21",DATE:"07/21/2009",DDATE:"21/07/2009",WK:"0",FARE:76},{DAY:"22",DATE:"07/22/2009",DDATE:"22/07/2009",WK:"0",FARE:71},{DAY:"23",DATE:"07/23/2009",DDATE:"23/07/2009",WK:"0",FARE:56},{DAY:"24",DATE:"07/24/2009",DDATE:"24/07/2009",WK:"0",FARE:84},{DAY:"25",DATE:"07/25/2009",DDATE:"25/07/2009",WK:"1",FARE:91},{DAY:"26",DATE:"07/26/2009",DDATE:"26/07/2009",WK:"1",FARE:83},{DAY:"27",DATE:"07/27/2009",DDATE:"27/07/2009",WK:"0",FARE:56},{DAY:"28",DATE:"07/28/2009",DDATE:"28/07/2009",WK:"0",FARE:106},{DAY:"29",DATE:"07/29/2009",DDATE:"29/07/2009",WK:"0",FARE:147},{DAY:"30",DATE:"07/30/2009",DDATE:"30/07/2009",WK:"0",FARE:129},{DAY:"31",DATE:"07/31/2009",DDATE:"31/07/2009",WK:"0",FARE:110}];

funcConfig=new Array();
funcConfig["en-US"]="www.functravel.com";
funcConfig["nb-NO"]="www.functravel.no";
funcConfig["imgSrv1"]="img1.func.no";
funcConfig["imgSrv2"]="img2.func.no";
function $$(elementid)
{
    if(document.getElementById(elementid))
    return true;
    return false;
};
Object.extend = function(destObj, srcObj) 
{
  for (var property in srcObj)
    destObj[property] = srcObj[property];
  return destObj;
};
var PrototypeEleFuncs = 
{
    GetWidth:function(){return this.offsetWidth},
    SetClass:function(ClassName){this.className = ClassName},
    ReplaceInClass:function(strFind,strReplace){this.className = this.className.replace(strFind,strReplace)},
    GetClass:function(){return this.className},
    SetVisible:function(visible){this.style.display=visible?"inline":"none"},
    IsVisible:function(){return this.style.display=="none"?false:true},
    SetVisibility:function(visible){this.style.visibility=visible?"visible":"hidden"},
    Show:function(){this.style.display ="";},
    Hide:function(){this.style.display ='none';},
    Toggle:function(){this.style.display=this.style.display=="none"?"":"none";},
    Focus:function(){if(this.tagName.toLowerCase()!="input") return; this.focus(); this.select();},
    ToggleChk:function(){if(this.tagName.toLowerCase()!="input") return; this.checked = !this.checked},
    RegisterEvt: function(EventType,Listener){
        return new Event.RegisEvent(this,EventType,Listener,false,false);
    },
    GetData:function(key)
    {
        return this.getAttribute("data-" + key);
    },
    Pos:function()
    {
        var obj = this;
        	var curleft = curtop = 0;
            if (obj.offsetParent) 
            {
            do {
			            curleft += obj.offsetLeft;
			            curtop += obj.offsetTop;
            } while (obj = obj.offsetParent);
            }
	            return [curleft,curtop];
    }
};
if (!window.Event) var Event = { };
Event.RegisEvent =function (elem, type, listener, useCapture, noAutoStart) //http://www.codehouse.com
{
   var proto = arguments.callee.prototype;

   this.ele = elem;
   this.type = type;
   this.cap = useCapture;
   this.l = listener;


   proto.start = function()
   {
      if( this.ele.attachEvent )
      {
         this.ele.attachEvent("on" + this.type, this.l);
      }
      else if( this.ele.addEventListener )
      {
         this.ele.addEventListener(this.type, this.l, this.cap);
      }
   }

   if( ! noAutoStart )
   {
      this.start(elem, type, listener);
   }

   proto.stop = function()
   {
      if( this.ele.detachEvent )
      {
          this.ele.detachEvent("on" + this.type, this.l);
      }
      else if( this.ele.removeEventListener )
      {
          this.ele.removeEventListener(this.type, this.l, this.cap);
      }
   }
};

function $(element)
{
    var result = element;
    if(typeof(element)!="string")
    return Object.extend(result,PrototypeEleFuncs);
    
    if(document.getElementById(element)) 
    {
        result = document.getElementById(element);
        Object.extend(result,PrototypeEleFuncs);
        return result;       
    }
    else
    {
        throw("not found " + element + " [function $]");
    }
};
function $S(element)
{
   
    var result = element;
    if(typeof(element)=="string")
    {
        result = document.getElementById(element);
    }
    return result.style;
};

function FormatTemplate(template,dataObject, isUsingIndex)
{
    if(dataObject.length)
    {
        for(var j=0;j< dataObject.length;j++)
        {
            for(i in dataObject[j])
              {
                  if(isUsingIndex == true)
                    template  = template.replace(new RegExp('\\{' + j + '.' + (i) + '\\}',"g"), dataObject[j][i]);
                  else
                    template  = template.replace(new RegExp('\\{' + (i) + '\\}',"g"), dataObject[j][i]);
                  if(i =="AutoInc") dataObject[j][i]++;
              }
        }
      return template;
    }
    
    for(i in dataObject)
      {
            var replaceText = dataObject[i];
            if(replaceText =="{auto}") replaceText = "1";
            template  = template.replace(new RegExp('\\{' + (i) + '\\}',"g"), replaceText);
		
      }
   return template;
};
if(typeof(funcAPI)=="undefined" || funcAPI==null)
{
  funcAPI =
  {
	ACTB:new Array(),
	SearchPanels: new Array(),
	Init:function()
	{
		this.loadJsCssFile("http://"+funcConfig["imgSrv2"]+"/w3s/js/AutoComplete.js?ver=3.2","js");
		this.loadJsCssFile("http://"+funcConfig["imgSrv1"]+"/w3s/css/SearchForm.css?ver=3.2","css");
	},
	
	SearchPanel:function(canvas)
	{
		funcAPI.SearchPanels[canvas] = this;
		var _type = 1;
		var _lang = "";
		var _color = "";
		var _currency = "";
		var _from = "";
		var _to = "";
		var _fromid = "";
		var _toid = "";
		var _dmid = "";
		var _rmid = "";
		var _searchid = "";
		var _AC_URL = "";
		var _intervalid = null;
		var _flashinterval = null;
		var _canvasid = canvas;
		var _banner = "";
		var _curid="";
		
		this.SetLanguage = function(lang)
		{
			_lang = lang;
			_AC_URL="http://" + funcConfig[lang] + "/clientcalls/Flight/AutoComplete.aspx?action=api" + "&lang=" + lang + "&dataType=";
		};
		this.SetCurrency = function(cur){_currency = cur};
		this.SetType = function(type){
			_type=type;
			switch(type)
			{
				case 1:
					_width = "200px";
					_height = "85px";
					_banner = "leader";
					break;
				case 2:
					_width = "260px";
					_height = "24px";
					_banner = "bottom";
					break;
				case 3:
					_width = "135px";
					_height = "95px";
					_banner = "prospot";
					break;
			}
		};
		this.SetColor = function(color){_color=color};
		this.SetFrom = function(from){_from=from};
		this.SetTo = function(to){_to=to};
		
		this.Render = function()
		{
			_fromid = "func_from_" + _canvasid + _type;
			_toid = "func_to_" + _canvasid+ _type;
			_dmid = "func_dm_" + _canvasid+ _type;
			_rmid = "func_rm_" + _canvasid+ _type;
			_searchid = "func_Search_" + _canvasid+ _type;
			
			var objFormat = null;
			var sHtml = "";
			switch(_type)
			{
				case 1:
					objFormat = {Depart:funcStrings.Depart,Return:funcStrings.Return,Search:funcStrings.Search,from:_fromid,to:_toid,ctlSearch:_searchid,apfrom:_from,apto:_to,dm:_dmid,rm:_rmid,Title1:funcStrings.Title1,Title2:funcStrings.Title2};
					sHtml = FormatTemplate(funcTemplates.Leader, objFormat);
					break;				
				case 2:
					objFormat = {Depart:funcStrings.Depart,Return:funcStrings.Return,Search:funcStrings.Search,from:_fromid,to:_toid,ctlSearch:_searchid,apfrom:_from,apto:_to,dm:_dmid,rm:_rmid,Title1:funcStrings.Title1,Title2:funcStrings.Title2};
					sHtml = FormatTemplate(funcTemplates.Bottom, objFormat);
					break;
				case 3:
					_curid = "func_cur_" + _canvasid + _type;
					
					objFormat = {Depart:funcStrings.Depart,Return:funcStrings.Return,Search:funcStrings.Search,from:_fromid,to:_toid,ctlSearch:_searchid,apfrom:_from,apto:_to,dm:_dmid,rm:_rmid,Title1:funcStrings.Title1,Title2:funcStrings.Title2,ViewPrice:funcStrings.ViewPrice,cur:_curid, objId:'abc'};
					sHtml = FormatTemplate(funcTemplates.ProSpot, objFormat);
					break;
			}
			$(_canvasid).innerHTML = sHtml;
			
			_intervalid = setInterval("funcAPI.SearchPanels['" + _canvasid + "'].Action()", 500);
		};
		
		this.Action = function()
		{
			try
			{	
				InitComponents();
				RegisEvent();
				InitAutoComplete();
				clearInterval(_intervalid);
			}
			catch(e)
			{
				throw e;
				return;
			}
		};
		function InitComponents()
		{
			funcAPI.loadMonth($(_dmid),"");funcAPI.loadMonth($(_rmid),"");
			if(_type==3)
			{
				funcAPI.loadDataToCb($(_curid), func_currencies, _currency);
			}
		};
		function RegisEvent()
		{
			var timeOut = 200;
			$(_dmid).RegisterEvt("change", function()
			{
				if($(_dmid).selectedIndex > $(_rmid).selectedIndex)
					$(_rmid).selectedIndex = $(_dmid).selectedIndex;
			});
			$(_rmid).RegisterEvt("change", function()
			{
				if($(_dmid).selectedIndex > $(_rmid).selectedIndex)
					$(_dmid).selectedIndex = $(_rmid).selectedIndex;
			});
			$(_dmid).RegisterEvt("focus", function()
			{
				setTimeout("funcAPI.fillData('"+_fromid + "');", timeOut);
			});
			$(_rmid).RegisterEvt("focus", function()
			{
				setTimeout("funcAPI.fillData('"+_toid + "');", timeOut);
				setTimeout("funcAPI.fillData('"+_fromid + "')", timeOut);
			});
			
			$(_fromid).RegisterEvt("focus",function(){
				$(_fromid).Focus();
			});
			$(_toid).RegisterEvt("focus",function(){
				$(_toid).Focus();
				setTimeout("funcAPI.fillData('"+_fromid + "');", timeOut);
			});
			$(_searchid).RegisterEvt("focus",function(){
				setTimeout("funcAPI.fillData('"+_fromid + "')", timeOut);
				setTimeout("funcAPI.fillData('"+_toid + "')", timeOut);
			});
			$(_fromid).RegisterEvt("keypress", function(e){funcAPI.submit(e, _searchid)});
			$(_toid).RegisterEvt("keypress", function(e){funcAPI.submit(e, _searchid)});
			$(_searchid).RegisterEvt("click", function(){
				if(!CheckData())
				{
					window.open("http://" + funcConfig[_lang] + "/"+funcStrings.Flight+"/");
					return;
				}
				var rgApcode = new RegExp(".*?\([A-Z]{3}\)");
				
				var location = "http://" + funcConfig[_lang] + "/"+funcStrings.Flight+"/"+funcAPI.getCityName($(_fromid).value)+"/"+funcAPI.getCityName($(_toid).value)+"/Search-Flight?";
				var fromCity=false; var toCity=false;
				var city = "0";
				var apfrom=$(_fromid).value;
				var apto=$(_toid).value;
				if(apfrom.indexOf("\[")>-1)
					fromCity = true;
				if(apto.indexOf("\[")>-1)
					toCity = true;
				if(fromCity){if(toCity)	city="3"; else city="1";}
				else {if(toCity) city="2"; else city="0";}
				
				if(apfrom.match(rgApcode))
					apfrom = apfrom.match(rgApcode)[1];
				location += "Apfrom=" + apfrom;
				if(apto.match(rgApcode))
					apto = apto.match(rgApcode)[1];
				location += "&Apto=" + apto;
				location += "&OneWay=0";
				location += "&City=" + city;
				location += "&DMonth=" + $(_dmid).options[$(_dmid).selectedIndex].value;
				location += "&RMonth=" + $(_rmid).options[$(_rmid).selectedIndex].value;
				if(_type==3)
					location += "&Cur=" + $(_curid).options[$(_curid).selectedIndex].value;
				else
					location += "&Cur=" + _currency;
				location += "&utm_source=w3schools&utm_campaign=w3banner&utm_medium=" + _banner;
				window.open(location);
			});
		};
		function InitAutoComplete()
		{
			var actbWidth = document.all ? $(_fromid).offsetWidth : $S(_fromid).width;
			funcAPI.ACTB[_fromid] = new func_api_actb($(_fromid), null, actbWidth, "", _AC_URL, "apfrom", null);
			funcAPI.ACTB[_toid] = new func_api_actb($(_toid), null, actbWidth, "", _AC_URL, "apto", null);
		};
		function CheckData()
		{
			var apfrom=$(_fromid).value;
			var apto=$(_toid).value;
			if(apfrom.length<3)
			{
				$(_fromid).focus();
				return false;
			}
			if(apto.length<3)
			{
				$(_toid).focus();
				return false;
			}
			return true;
		};
	},
	
	fillData:function(ctlid)
	{
		var actb = funcAPI.ACTB[ctlid];
		if($$(actb.actb_tabname))
			document.body.removeChild($(actb.actb_tabname));
		
		for(var i=0; i< actb.actb_keywords.length; i++)
		{
			var keyword = actb.actb_keywords[i];
			if(keyword.toLowerCase().indexOf($(ctlid).value.toLowerCase()) > -1)
			{
				if(keyword.indexOf(" - ") == 0)
					$(ctlid).value = keyword.replace(" - ","");
				else
					$(ctlid).value = keyword;
				break;
			}
		}
	},
	
	submit:function(e, btnid)
	{
		var Key = (window.event) ? window.event.keyCode : e.which;
        
        if(Key == 13)
        {
			if($$("api_tat_table_apfrom") || $$("api_tat_table_apto"))
			{
				return;
			}
            $(btnid).click();
        }
	},
	
	getCityName:function(name)
	{
		var parts = name.split(',');
		return parts[0].replace(new RegExp(" ","g"), '_');
	},
	
	loadJsCssFile:function(filename, filetype)
	{
		if (filetype=="js"){ //if filename is a external JavaScript file
			var fileref=document.createElement('script')
			fileref.setAttribute("type","text/javascript")
			fileref.setAttribute("src", filename)
		 }
		 else if (filetype=="css"){ //if filename is an external CSS file
			  var fileref=document.createElement("link")
			  fileref.setAttribute("rel", "stylesheet")
			  fileref.setAttribute("type", "text/css")
			  fileref.setAttribute("href", filename)
		 }
		 if (typeof fileref!="undefined")
			document.getElementsByTagName("head")[0].appendChild(fileref)
	},
	
	addLoadEvent:function(func)
	{ 
		var oldonload = window.onload; 
		if (typeof window.onload != 'function') {
			window.onload = func; 
		} else { 
			window.onload = function() { 
				if (oldonload) { 
					oldonload(); 
				}
				func(); 
			} 
		}
	},
	loadMonth: function(ddl, dfvalue)
	{
		ddl.length = func_months.length;
		var index = 0;
		for(var i=0;i< func_months.length;i++)
		{
			if(i==0)
				ddl.options[i] = new Option(func_months[i][2], func_months[i][0] + "-" + func_months[i][1]);
			else
				ddl.options[i] = new Option(func_months[i][2] + ", " + func_months[i][0], func_months[i][0] + "-" + func_months[i][1]);
			if (ddl.options[i].value == dfvalue)
				index = i;
		}
		ddl.selectedIndex = index;
	},
	loadDataToCb: function(ddl, data, dfvalue)
	{
		ddl.length = data.length;
		var index = 0;
		for(var i=0;i< data.length;i++)
		{
			ddl.options[i] = new Option(data[i], data[i]);
			if (ddl.options[i].value == dfvalue)
				index = i;
		}
		ddl.selectedIndex = index;
	}
  }
}

var funcTemplates={
	Leader:'<div class="LeaderBoard" style="text-align:left;"><div><img src="http://img1.func.no/w3s/images/LeaderBoard_Logo.gif" alt="" /><span style="margin-left:23px">{Title1}</span><span style="color:#00718c"> [{Title2}]</span></div><table><col width="363" /><col width="48" /><col width="128" /><col width="" /><tr><td><input style="width:345px" type="text" id="{from}" value="{apfrom}" tabindex="200" /></td><td>{Depart}:</td><td><select class="funcCombo" id="{dm}" tabindex="201"><option>Next 30 days</option></select></td><td rowspan="2"><input style="border:none;height:29px;" class="W3SButtonSearch" type="button" value="{Search}" id="{ctlSearch}" tabindex="204"/></td></tr><tr><td><input style="width:345px" type="text" id="{to}" value="{apto}" tabindex="202"/></td><td>{Return}:</td><td><select class="funcCombo" id="{rm}" tabindex="203"><option>Next 30 days</option></select></td></tr></table></div>',
	Bottom:'<div class="BottBanner"><div><img src="http://img1.func.no/w3s/images/BottBanner_Logo.gif" alt="" /><span style="margin-left:23px">{Title1}</span><br /><span style="color:#00718c"> [{Title2}]</span></div><table  cellpadding="0"><col width="315" /><col width="49" /><col width="" /><tr><td><input style="width:296px" type="text" id="{from}" value="{apfrom}" tabindex="300" /></td><td>{Depart}:</td><td><select class="funcCombo" id="{dm}" tabindex="301"><option>Next 30 days</option></select></td></tr><tr><td><input style="width:296px" type="text" id="{to}" value="{apto}" tabindex="302" /></td><td>{Return}:</td><td><select class="funcCombo" id="{rm}" tabindex="303"><option>Next 30 days</option></select></td></tr><tr><td></td><td></td><td style="padding-bottom:2px;"><input style="border:none;height:29px;font-size:10pt;" class="W3SButtonLongSearch" type="button" value="{Search}" id="{ctlSearch}" tabindex="304"/></td></tr></table></div>',
	ProSpot:'<div class="ProdSpot" style="position:relative"><div class="Header"><img src="http://img1.func.no/w3s/images/BottBanner_Logo.gif" alt="" /><span style="margin-left:23px">{Title1}</span><br /><span style="color:#00718c"> [{Title2}]</span></div><table cellpadding="1"><col width="315" /><col width="49" /><col width="" /><tr><td><input style="width:299px" type="text" id="{from}" value="{apfrom}" tabindex="400" /></td><td>{Depart}:</td><td><select class="funcCombo" id="{dm}" tabindex="401"><option>Next 30 days</option></select></td></tr><tr><td><input style="width:299px" type="text" id="{to}" value="{apto}" tabindex="402"/></td><td>{Return}:</td><td><select class="funcCombo" id="{rm}" tabindex="403"><option>Next 30 days</option></select></td></tr><tr><td style="padding-left:5px">{ViewPrice}<select class="ViewPrice" id="{cur}"><option>EUR</option></select></td><td></td><td style="padding-top:5px"><input class="W3SButtonLongSearch" style="border:none;height:29px;font-size:10pt;" type="button" value="{Search}" id="{ctlSearch}" tabindex="404"/></td></tr></table><div class="FlashObj" style="width:550px;height:306px;background-color:#FFFFFF;top:0px;border-top:1px solid #000000;position:relative"><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0" WIDTH="550" HEIGHT="306" id="{objid}"><param name="allowScriptAccess" value="always" /><param name="wmode" value="transparent" /><param name="movie" value="http://img2.func.no/w3s/flash/flightChart_W3S.swf" /><param name="quality" value="high" /><param name="bgcolor" value="#ffffff" /><param name="FlashVars" value="{flashvars}" /><embed src="http://img2.func.no/w3s/flash/flightChart_W3S.swf" quality="high" bgcolor="#FFFFFF" wmode="transparent" WIDTH="550" HEIGHT="306" NAME="{objid}" swLiveConnect="true" ALLOWSCRIPTACCESS="always" TYPE="application/x-shockwave-flash" PLUGINSPAGE="http://www.macromedia.com/go/getflashplayer" flashVars="{flashvars}"></embed></object></div><div class="SG_divHelpGraph" onmouseover="javascript:this.style.display=\'none\'" ><div style="left:180px;"><img alt="" src="http://img1.func.no/w3s/images/depart_tip.png" style="position:absolute;top:-10px;left:-5px" /><span style="position:absolute;top:5px;left:15px;font-size:17px;font-weight:bold;color:White;text-align:left;font-style:normal"><b>Select<br><span style="color:Black">departure</span>day</b><br>[Points on chart]</span></span></div><div style="left:310px;top:-15px"><img alt="" src="http://img1.func.no/w3s/images/return_tip.png" style="position:absolute;top:0px;left:-10px" /><span style="position:absolute;top:17px;left:10px;font-size:17px;font-weight:bold;color:White;text-align:left;font-style:normal"><b>Select<br><span style="color:Black">return</span>day</b><br>[Points on chart]</span></span></div></div></div>'
}