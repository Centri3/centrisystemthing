DwarfPlanet	"Foj/Lercurnis TFO.1"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Aquaria"
	Mass            0.00774
	Radius          1.63e+03
	InertiaMoment   0.38
	Oblateness      0.0137
	OblatenessInfo  0.00218
	RotationPeriod  414
	RotationEpoch   1451545
	Obliquity       -15.2
	EqAscendNode    64.7

	EndogenousHeating 0.000701
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.711 0.709 0.708)

	Surface
	{
		Preset         "lercurnis_tfo_foj.cfg"
		SurfStyle       0.629
		Randomize      (0.326, 0.752, 0.568)
		colorDistMagn   0.0418
		colorDistFreq   77.5
		detailScale     128
		drivenDarkening 0
		seaLevel        -0.107
		snowLevel       2
		tropicLatitude  0.149
		icecapLatitude  2
		icecapHeight    0.0211
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.361
		heightTempGrad  0.625
		beachWidth      0.00115
		tropicWidth     0.07
		mainFreq        1.11
		venusFreq       1.12
		venusMagn       0.267
		mareFreq        5
		mareDensity     0.107
		terraceProb     0
		erosion         0
		montesMagn      0.03
		montesFreq      25
		montesSpiky     0.5
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.07
		riversSin       6.75
		riftsMagn       1
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.168
		eqridgeWidth    1
		eqridgeModMagn  1.66
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     0.216
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.33
		volcanoFreq     0.687
		volcanoDensity  0.206
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          552.802057
		SemiMajorAxis   62.818188
		Eccentricity    0.580152672
		Inclination     15
		AscendingNode   68.7022901
		ArgOfPericenter 129.160305
		MeanAnomaly     -173.129771
	}
}

