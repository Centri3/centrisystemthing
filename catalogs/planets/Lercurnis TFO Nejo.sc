DwarfPlanet	"Nejo/Lercurnis TFO.2"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Aquaria"
	Mass            0.00187
	Radius          605
	InertiaMoment   0.398
	Oblateness      0.103
	OblatenessInfo  0.0176
	RotationPeriod  8
	RotationEpoch   1451545
	Obliquity       74.2
	EqAscendNode    2.74

	EndogenousHeating 6
	Albedo          0.6
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_tfo_nejo.cfg"
		SurfStyle       0.75
		Randomize      (-0.004, 0.979, -0.972)
		colorDistMagn   0.0442
		colorDistFreq   78.8
		detailScale     64
		drivenDarkening 0
		seaLevel        0.282
		snowLevel       2
		tropicLatitude  0.695
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.12
		heightTempGrad  0.625
		beachWidth      0.000687
		tropicWidth     0.679
		mainFreq        0.382
		venusFreq       1.27
		venusMagn       0.878
		mareFreq        1
		mareDensity     0.145
		terraceProb     0.464
		erosion         0
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0445
		dunesFreq       4.99
		dunesFraction   0.638
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.74
		riversSin       5.53
		riftsMagn       100
		riftsFreq       7.94
		riftsSin        10
		eqridgeMagn     0.573
		eqridgeWidth    0.0308
		eqridgeModMagn  1.87
		eqridgeModFreq  5.8
		canyonsMagn     0.501
		canyonsFreq     0.25
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      1
		cracksOctaves   15
		craterMagn      0.3
		craterFreq      1
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.282
		volcanoFreq     0.794
		volcanoDensity  0.16
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.145
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      25
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.641
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
		Period          1338.42047
		SemiMajorAxis   115.098245
		Eccentricity    0.290076336
		Inclination     10
		AscendingNode   -2.7480916
		ArgOfPericenter 140.152672
		MeanAnomaly     -24.7328244
	}
}

