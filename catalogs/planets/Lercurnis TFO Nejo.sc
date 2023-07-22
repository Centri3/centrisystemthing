DwarfPlanet	"Nejo/Lercurnis TFO.2"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Aquaria"
	Mass            0.001868
	Radius          605.46
	InertiaMoment   0.3982
	Oblateness      0.10305
	OblatenessInfo  0.017616
	RotationPeriod  8
	RotationEpoch   1451545
	Obliquity       74.198
	EqAscendNode    2.7432

	Albedo          0.4
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
		SurfStyle       0.74999
		Randomize      (-0.004, 0.979, -0.972)
		colorDistMagn   0.044189
		colorDistFreq   78.834
		detailScale     64
		drivenDarkening 0
		seaLevel        0.28244
		snowLevel       2
		tropicLatitude  0.33292
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.11996
		heightTempGrad  0.625
		beachWidth      0.0013295
		tropicWidth     0.07
		mainFreq        1.9172
		venusFreq       2
		venusMagn       0.61069
		mareFreq        1
		mareDensity     0.14504
		terraceProb     0.46414
		erosion         0
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.044497
		dunesFreq       4.9948
		dunesFraction   0.63835
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.7355
		riversSin       5.5269
		riftsMagn       15
		riftsFreq       1.8321
		riftsSin        10
		eqridgeMagn     0.57252
		eqridgeWidth    0.0308
		eqridgeModMagn  1.8702
		eqridgeModFreq  5.8015
		canyonsMagn     0.50138
		canyonsFreq     0.25021
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      2
		cracksOctaves   15
		craterMagn      0.3
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.28244
		volcanoFreq     0.79389
		volcanoDensity  0.16031
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.14504
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
		Hapke           0.64122
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          1371.02259
		SemiMajorAxis   115.098245
		Eccentricity    0.290076336
		Inclination     10
		AscendingNode   -2.7480916
		ArgOfPericenter 140.152672
		MeanAnomaly     -24.7328244
	}
}

